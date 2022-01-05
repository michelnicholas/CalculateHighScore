public class Main {

    public static void  main(String[] args){


        /*
        Hard Coding with fields
         */
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        calculateScore(gameOver,score,levelCompleted,bonus)


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your high score is " + highScore);

       highScore =  calculateScore(true,10000,8,200);
        System.out.println("Your final score is " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim" , highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Michel" , highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Nicholas" , highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Nia" , highScorePosition);


    }




    public static void displayHighScorePosition(String name,int highScore){
            System.out.println(name + " Your managed to get into postion  "
                    + highScore + " on the high score table");
        }

        public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        if (playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        if (playerScore >= 100 &&  playerScore < 500){
            return 3;
        }
        else{
            return 4;
        }

            /*
            RECURSION
             */
//        int position = 4;
//        if (playerScore >= 1000){
//            position = 1;
//        }
//        else if (playerScore >= 500){
//            position = 2;
//        }
//        else if (playerScore >= 100){
//            position = 2;
//        }
//        return position;
//
        }





        public static int calculateScore(boolean gameOver, int score , int levelCompleted, int bonus){
            if (gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                System.out.println("Your final score is " + finalScore);
                return finalScore;
            }
            return -1;
        }



}

