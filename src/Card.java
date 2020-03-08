

public class Card {

    protected String name_of_card;
    //private String image;

    protected String description;

    protected GameOption[] options;
    //private

    public GameOption[] getOptions(){
      return options;
    }

    public Card(){
        this.name_of_card = "";
        this.description = "";
        this.options = null;
    }


    public Card(String name, String descript, GameOption[] arr){
      this.name_of_card = name;
      this.description = descript;
      this.options = arr;
    }


    public void show_card(){
      System.out.println(this.name_of_card + "" + this.description + "" + this.options + "");
      for(int i = 0; i<options.length; i++){
        System.out.println((i+1)+ ". "+options[i]);
      }
    }



    public GameOption getOption(int choice){
      //check bounds
      if(choice >= 0 && choice <options.length){
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
