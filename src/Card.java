

public class Card {

    private String name_of_card;
    //private String image;

    private String description;

    private gameOption[] options;


    public Card(String name, String descript, gameOption[] arr){
      this.name_of_card = name;
      this.description = descript;
      this.options = arr;
    }


    public void show_card(){
      System.out.println(this.name_of_card + "" + this.description + "" + this.options + "");
    }

    public gameOption getOption(int choice){
      //check bounds
      if(choice > 0 && choice < options.length){
        return options[choice];
      }
      else{
        return null;
      }
    }
    public Card getSubCard(int option) {
        return options[option].getSubCard();
    }

    //    public void option_A_execute(){
//    }
//
//    public void option_B_execute(){
//
//    }

}
