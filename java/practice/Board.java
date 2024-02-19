package practice;

public class Board {
    private String btitle;
    private String bwriter;
    private String bcontent;
    private int bno;

    public Board(String btitle, String bwriter, String bcontent, int bno) {
        this.btitle = btitle;
        this.bwriter = bwriter;
        this.bcontent = bcontent;
        this.bno = bno;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public String getBwriter() {
        return bwriter;
    }

    public String getBcontent() {
        return bcontent;
    }

    public int getBno() {
        return bno;
    }

    @Override
    public String toString() {
        return "Board{" +
                "btitle='" + btitle + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bno=" + bno +
                '}';
    }
}
