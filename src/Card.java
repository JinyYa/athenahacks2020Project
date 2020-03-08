

public class Card {

    private String name_of_card;
    //private String image;

    private String Description;

    private gameOption[] options;


    public Card(String name, String descript, String OptionA, ){
      this.name_of_card = name;
      this.description = descript;
      this.optionAText = optionA;
    }


    public void show_card(){

    }

    public gameOption getOption(int choice){
      //check bounds
      if(gameOption > 0 && gameOption <= gameOption.length){
        return getOption[choice];
      }
      else{
        return;
      }
    }

    //    public void option_A_execute(){
//    }
//
//    public void option_B_execute(){
//
//    }

}
