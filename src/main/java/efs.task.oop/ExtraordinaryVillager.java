public class ExtraordinaryVillager extends Villager{
    
    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private final String action;

        Skill(String action) {
            this.action = action;
        }

        public String getAction() {
            return action;
        }
    }

    private Skill skill;

    ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }
}
