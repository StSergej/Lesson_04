package handler;

public class Main {
    public static void main(String[] args) {

        String docXML = "XMLHandler";
        String docTXT = "TXTHandler";
        String docDOC = "DOCHandler";


        if (!(docXML.equalsIgnoreCase(docTXT))) {
        }
        if (!(docXML.equalsIgnoreCase(docDOC))) {
            System.out.println("Вы открыли документ XMLHandler");

            AbstractHandler xml = new XMLHandler();
            xml.open();
            xml.create();
            xml.change();
            xml.save();
        }
        System.out.println("______________________");
        if (!(docTXT.equalsIgnoreCase(docXML))) {
        }
        if (!(docTXT.equalsIgnoreCase(docDOC))) {

            System.out.println("Вы открыли документ TXTHandler");

            AbstractHandler txt = new TXTHandler();
            txt.open();
            txt.create();
            txt.change();
            txt.save();
        }
        System.out.println("______________________");
        if (!(docDOC.equalsIgnoreCase(docXML))) {
        }
        if (!(docDOC.equalsIgnoreCase(docTXT))) {
            System.out.println("Вы открыли документ DOCHandler");

            AbstractHandler doc = new DOCHandler();
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        }
    }
}

