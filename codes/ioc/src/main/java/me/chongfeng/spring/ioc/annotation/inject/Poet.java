package me.chongfeng.spring.ioc.annotation.inject;

public class Poet implements Performer {
    private String name;
    private Poetry poetry;

    public Poet() {}

    public Poet(String name, Poetry poetry) {
        this.name = name;
        this.poetry = poetry;
    }

    @Override
    public void perform() throws Exception {
        System.out.println(String.format("%s朗诵诗歌： %s", name, poetry.getName()));
    }

}
