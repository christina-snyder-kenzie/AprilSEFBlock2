package org.example.tvproducer;

public class CastMember {
    private String characterName, actorName;

    public CastMember(String characterName, String actorName){
        this.characterName = characterName;
        this.actorName = actorName;
    }

    public CastMember(String characterName){
        this.characterName = characterName;
        actorName = "TBD";
    }

    //character played by actor

    //character played by TBD
    //character

    public String toString(){
        return characterName + " played by " + actorName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
