/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.builder.textview;

/**
 *
 * @author dengxt
 */
public class HTMLBuilder implements Builder{
    
    StringBuffer buffer  = null;
    
    public HTMLBuilder(){
        buffer = new StringBuffer();
    }

    @Override
    public void makeTitle(String text) {
        text = replaceTag(text);
        buffer.append("<title>").append(text).append("</title>");
    }

    @Override
    public void makeBody(String text) {
        text = replaceTag(text);
        buffer.append("<body>").append(text).append("</body>");
    }

    @Override
    public void makeSignature(String text) {
        int index = buffer.lastIndexOf("</body>");
        buffer.insert(index, "</br>======================</br>");
        index = buffer.lastIndexOf("</body>");
        buffer.insert(index, text);
    }

    @Override
    public String text() {
        buffer.insert(0, "<html>");
        buffer.append("</html>");
        return buffer.toString();
    }
    
    private String replaceTag(String text){
        text = text.replace("<", "&lt;");
        text = text.replace(">", "&gt;");
        return text;
    }
}
