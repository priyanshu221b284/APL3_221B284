abstract class Bharatvanshi {
    String name;

    Bharatvanshi(String name) {
        this.name = name;
    }

    abstract void fight();
    abstract void obey();
}

class Pandav extends Bharatvanshi {
    boolean kindness;

    Pandav(String name) {
        super(name);
        this.kindness = true;
    }

    @Override
    public void fight() {
        System.out.println(name + " is a skilled fighter.");
    }

    @Override
    public void obey() {
        System.out.println(name + " is obedient.");
    }

    void kind() {
        System.out.println(name + " is kind.");
    }
}

class Kaurav extends Bharatvanshi {
    boolean cruelty;
    boolean kindness;

    Kaurav(String name) {
        super(name);
        this.cruelty = true;
        this.kindness = false;
    }

    @Override
    public void fight() {
        System.out.println(name + " is a skilled fighter.");
    }

    @Override
    public void obey() {
        System.out.println(name + " disobeys.");
    }

    void cruel() {
        System.out.println(name + " is cruel.");
    }
}

class Arjun extends Pandav {
    Arjun(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println(name + " is a great fighter.");
    }
}

class Bheem extends Pandav {
    Bheem(String name) {
        super(name);
        this.kindness = false; // Less kind
    }

    @Override
    public void fight() {
        System.out.println(name + " is a powerful fighter.");
    }
}

class Duryodhan extends Kaurav {
    Duryodhan(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println(name + " is a notorious fighter.");
    }
}

class Vikarn extends Kaurav {
    Vikarn(String name) {
        super(name);
        this.cruelty = false;
        this.kindness = true; // Noble man
    }

    @Override
    public void fight() {
        System.out.println(name + " is a noble fighter.");
    }

    @Override
    public void obey() {
        System.out.println(name + " is obedient.");
    }

    void kind() {
        System.out.println(name + " is kind.");
    }
}

public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun("Arjun");
        Bheem bheem = new Bheem("Bheem");
        Duryodhan duryodhan = new Duryodhan("Duryodhan");
        Vikarn vikarn = new Vikarn("Vikarn");

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.cruel();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}

