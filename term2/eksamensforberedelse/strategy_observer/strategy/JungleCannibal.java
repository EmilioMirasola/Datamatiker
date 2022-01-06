package term2.eksamensforberedelse.strategy_observer.strategy;

public class JungleCannibal
{
    private int health;

    public JungleCannibal(int health)
    {
        this.health = health;
    }

    public int getHealth()
    {
        return health;
    }

    public void dealDamage(int healthDamage) throws JungleCannibalException
    {
        if (health > 0)
        {
            this.health -= healthDamage;
        }
        else
        {
            throw new JungleCannibalException("This cannibal is dead");
        }
    }

    public void biteStudent(AcademicStudent academicStudent) throws AcademicStudentException, JungleCannibalException
    {
        if (health >= 0)
        {
            academicStudent.bite(5);
        }
        else
        {
            throw new JungleCannibalException("This cannibal is dead");
        }
    }
}
