document.addEventListener("DOMContentLoaded", () => {
    const compareButton = document.getElementById("compareButton");
    const resultElement = document.getElementById("result");

    getRandomHero(hero1 => {
        getRandomHero(hero2 => {
            displayHero(hero1, "hero1");
            displayHero(hero2, "hero2");

            const winner = compareHeroes(hero1, hero2);
            resultElement.textContent = `Vencedor: ${winner.name}`;
        });
    });

    compareButton.addEventListener("click", () => {
    
        getRandomHero(hero1 => {
            getRandomHero(hero2 => {
            
                displayHero(hero1, "hero1");
                displayHero(hero2, "hero2");

                const winner = compareHeroes(hero1, hero2);
                resultElement.textContent = `Vencedor: ${winner.name}`;
            });
        });
    });

    function getRandomHero(callback) {
        const randomId = Math.floor(Math.random() * 731) + 1;
        
        fetch(`https://superheroapi.com/api.php/6704570349636314/${randomId}`)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Erro na solicitação da API');
                }
                return response.json();
            })
            .then(data => {
                callback(data);
            })
            .catch(error => {
                console.error(error);
            });
    }

    function displayHero(hero, cardId) {
        if (!hero || !hero.image || !hero.image.url) {
            console.error('Dados de herói ausentes ou inválidos');
            return;
        }
    
        const card = document.getElementById(cardId);
        const bars = card.querySelectorAll(".bar"); 
    
        bars.forEach(bar => {
            const statName = bar.classList[1]; 
            const statValue = hero.powerstats[statName]; 
    
            if (statValue) {
                bar.style.width = `${statValue}%`; 
            } else {
                bar.style.width = "0%"; 
            }
        });
    
        const nameElement = card.querySelector("h2");
        const imageElement = card.querySelector("img");
        const fullNameElement = card.querySelector("p");
    
        nameElement.textContent = hero.name;
        imageElement.src = hero.image.url;
        imageElement.alt = hero.name;
        fullNameElement.textContent = `Nome Completo: ${hero.biography["full-name"] || 'Indefinido'}`;
    }
     
    function compareHeroes(hero1, hero2) {
        const powerstat1 = calculateTotalPower(hero1.powerstats);
        const powerstat2 = calculateTotalPower(hero2.powerstats);

        if (
            powerstat1 === null || powerstat2 === null ||
            isNaN(powerstat1) || isNaN(powerstat2)
        ) {
            return { name: "Indefinido" };
        } else if (powerstat1 > powerstat2) {
            return hero1;
        } else if (powerstat2 > powerstat1) {
            return hero2;
        } else {
            return { name: "Empate" }; 
        }
    }

    function calculateTotalPower(powerstats) {
        let totalPower = 0;
        for (const stat in powerstats) {
            if (powerstats.hasOwnProperty(stat) && powerstats[stat] !== null) {
                totalPower += parseInt(powerstats[stat]);
            }
        }
        return totalPower;
    }
});
