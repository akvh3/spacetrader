public class Player {

    private int skillPoints;
    private int fighterSkill;
    private int merchantSkill;
    private int engineerSkill;
    private int pilotSkill;
    private int credits;

    private String difficulty;

    public Player(int skillPoints, int fSkill,
                  int mSkill, int eSkill, int pSkill, int credits) {
        this.skillPoints = skillPoints;
        this.fighterSkill = fSkill;
        this.merchantSkill = mSkill;
        this.engineerSkill = eSkill;
        this.pilotSkill = pSkill;
        this.credits = credits;
    }

    //getter methods for instance data
    public int getFighterSkill() {
        return fighterSkill;
    }
    public int getMerchantSkill() {
        return merchantSkill;
    }
    public int getEngineerSkill() {
        return engineerSkill;
    }
    public int getPilotSkill() {
        return pilotSkill;
    }
    public int getCredits() {
        return credits;
    }
    public int getSkillPoints() {
        return skillPoints;
    }

    //inc methods for skills
    public void incFighterSkill() {
        this.fighterSkill += 1;
    }
    public void incMerchantSkill() {
        this.merchantSkill += 1;
    }
    public void incEngineerSkill() {
        this.engineerSkill += 1;
    }
    public void incPilotSkill() {
        this.pilotSkill += 1;
    }

    //dec methods for skills
    public void decFighterSkill() {
        this.fighterSkill -= 1;
    }
    public void decMerchantSkill() {
        this.merchantSkill -= 1;
    }
    public void decEngineerSkill() {
        this.engineerSkill -= 1;
    }
    public void decPilotSkill() {
        this.pilotSkill -= 1;
    }

    //setters for skills
    public void setFighterSkill(int points) {
        fighterSkill = points;
    }
    public void setMerchantSkill(int points) {
        merchantSkill = points;
    }
    public void setEngineerSkill(int points) {
        engineerSkill = points;
    }
    public void setPilotSkill(int points) {
        pilotSkill = points;
    }
    public void setSkillPoints(int points) {
        skillPoints = points;
    }
}
