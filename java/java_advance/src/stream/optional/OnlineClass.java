package stream.optional;

import java.util.Optional;

public class OnlineClass {
    private Integer id;
    private String title;
    private boolean closed;
    private Optional<Progress> progress; // 옵셔널리는 권장이지 권유는 아니다

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

   /* public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
*/
    @Override
    public String toString() {
        return "OnlineClass{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", closed=" + closed +
                '}';
    }
}