package project.SJmemo;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class Memo {
    private int seq;
    private String writer;
    private ImportLevel level;
    private LocalDate createAt;
    private String content;

    public Memo(int seq, String writer, ImportLevel level, LocalDate createAt, String content){
        this.seq = seq;
        this.writer = writer;
        this.level = level;
        this.createAt = createAt;
        this.content = content;
    }

    public static Memo fromCSV(String line) {
        StringTokenizer st = new StringTokenizer(line, " | ");
        return new Memo(
                Integer.parseInt(st.nextToken()), // seq
                st.nextToken(), // writer
                ImportLevel.valueOf(st.nextToken()), // level
                LocalDate.parse(st.nextToken()), // createAt
                st.nextToken() // content
        );
    }

    public int getSeq() {
        return seq;
    }

    public String getWriter() {
        return writer;
    }

    public String getContent() {
        return content;
    }

    public String printContent() {
//        return content.replaceAll("%", "\n");

//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(content, "%");
//        while (st.hasMoreTokens()) {
//            sb.append(st.nextToken()).append("\n");
//        }
//        return sb.toString();

        // ***************************************
        return content.replaceAll("\\\\n", "\n");
    }



    public LocalDate getCreateAt() {
        return createAt;
    }

    public ImportLevel getLevel() {
        return level;
    }
}
