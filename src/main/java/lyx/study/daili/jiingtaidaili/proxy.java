package lyx.study.daili.jiingtaidaili;

/**
 * @Title proxy
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:44
 */
public class proxy implements book{

    private book book;

    public proxy(book book){
        this.book=book;
    }

    @Override
    public void name() {
        System.out.println("������󡣡���");
        book.name();
    }
}
