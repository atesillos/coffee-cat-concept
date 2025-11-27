# Coffee-Cat-Concept
This is a proof of concept for a game: Coffee Cat. 

## About
Coffee Cat is a game where the player brews drinks for different monsters and mythical creatures. The game starts on the night of a New Moon where magic power is weaker. As the days advance to a Full Moon (the next 15 days), the difficulty increases... the chances that monsters order MORE is greater. After the Full Moon, the difficulty decreases back to normal, going back to the New Moon, another 15 days. 

## Design
The way the "Day by Day Moon Phase" (DPDMP) model works as described above. The formula to implement this would involve using modulo to change the day count into a number that can easily represent a percentage. The table below represents the percentages for the formula, which would look like ```dayCount % 30```. This would give a number between 

### Stats

| Remainder | Percentage |
| --------- | ---------- |
| 0         | .01 |
| 1, 29     | .05 |
| 2, 28     | .09 | 
| 3, 27     | .15 |
| 4, 26     | .19 |
| 5, 25     | .23 |
| 6, 24     | .29 |
| 7, 23     | .35 |
| 8, 22     | .45 |
| 9, 21     | .55 |
| 10, 20    | .65 |
| 11, 19    | .75 |
| 12, 18    | .85 |
| 13, 17    | .88 |
| 14, 16    | .92 |
| 15        | .99 |

