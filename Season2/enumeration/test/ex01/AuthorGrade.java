package enumeration.test.ex01;

public enum AuthorGrade {
    GUEST(1, "손님"), LOGIN(2, "회원"), ADMIN(3, "관리자");

    private final int level;
    private final String desc;

    AuthorGrade(int level, String desc) {
        this.level = level;
        this.desc = desc;
    }

    public int getLevel() {
        return level;
    }

    public String getDesc() {
        return desc;
    }
}
