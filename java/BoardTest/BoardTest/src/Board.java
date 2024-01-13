
package src;
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private String date;

    public Board(int bno,String btitle, String bcontent, String bwriter) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void setDate(String date) {
        this.date = date;
    }
}
