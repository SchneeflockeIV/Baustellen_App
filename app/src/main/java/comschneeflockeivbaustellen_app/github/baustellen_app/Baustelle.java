package comschneeflockeivbaustellen_app.github.baustellen_app;


public class Baustelle {

    private String title;
    private String subTitle;

    public Baustelle(String title, String subTitle){
        this.title = title;
        this.subTitle = subTitle;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSubTitle(String subTitle){
        this.subTitle = subTitle;
    }

    public String getTitle(){
        return this.title;
    }

    public String getSubTitle(){
        return this.subTitle;
    }

}
