# ROCK PAPER SCISSOR GAME

Rock paper scissors (also known by several other names and word orders, see § Names) is an intransitive hand game, usually played between two people, in which each player simultaneously forms one of three shapes with an outstretched hand. These shapes are "rock" (a closed fist), "paper" (a flat hand), and "scissors" (a fist with the index finger and middle finger extended, forming a V). The earliest form of "rock paper scissors"-style game originated in China and was subsequently imported into Japan, where it reached its modern standardized form, before being spread throughout the world in the early 20th century.

A simultaneous, zero-sum game, has three possible outcomes: a draw, a win, or a loss. A player who decides to play rock will beat another player who chooses scissors ("rock crushes scissors" or "breaks scissors" or sometimes "blunts scissors"[1]), but will lose to one who has played paper ("paper covers rock"); a play of paper will lose to a play of scissors ("scissors cuts paper"). If both players choose the same shape, the game is tied and is usually replayed to break the tie.

Rock paper scissors are often used as a fair choosing method between two people, similar to coin flipping, drawing straws, or throwing dice in order to settle a dispute or make an unbiased group decision. Unlike truly random selection methods, however, rock paper scissors can be played with some degree of skill by recognizing and exploiting non-random behaviour in opponents.[1]

[wikipedia](https://en.wikipedia.org/wiki/Rock_paper_scissors)

### Features
- Play Rock-Paper-Scissors against the computer.
- Score tracking for both the user and the computer.
- Multiple rounds based on user input.
- Handles invalid inputs gracefully.

## Getting Started
### Prerequisites

- Java Development Kit (JDK) installed on your system.
- An IDE or a text editor to run the Java code, or the command line to compile and run the code.

### Running the Program

Clone the Repository:

 ```
 git clone https://github.com/yourusername/rock-paper-scissors.git
 cd rock-paper-scissors
```

### Compile the Program:

`javac -d . Game.java Main.java`

### Run the Program:

java rod_paper_seassor.Main

### Gameplay:
  You will be prompted to enter the number of rounds you wish to play.
  For each round, choose one of the following options:
    0 for Rock 
    1 for Paper
    2 for Scissors
    
Any other number for a negative marking (invalid input)
After all rounds are completed, the program will announce the winner based on the scores.

### Code Structure

  Game.java:
      Contains the Game class which handles the core game logic, including random computer choices, determining the winner for each round, and keeping score.
  Main.java:
      Contains the Main class with the main method, which handles user input and initiates the game rounds.

### Example


Please enter an integer to choose a number of terms<br>
3<br>
You entered: 3<br>
Choose any one of them<br>
0----- Rock<br>
1----- Paper<br>
2----- Scissors<br>
Other--- Negative marking<br>



### Contributing

If you'd like to contribute to the project, feel free to fork the repository and submit a pull request with your changes.
License

This project is licensed under the MIT License - see the LICENSE file for details.
Acknowledgements

  This project was inspired by the classic Rock-Paper-Scissors game.
  Thanks to the open-source community for providing valuable resources and support.

Enjoy playing Rock-Paper-Scissors! If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

### Reference
1. Rock paper scissors. (2024, May 23). In Wikipedia. https://en.wikipedia.org/wiki/Rock_paper_scissors
