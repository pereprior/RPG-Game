package Character.Job;

import Character.Stat.Stat;

public abstract class Job {

    public abstract int modifier(Stat stat);

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
