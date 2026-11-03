public class my_formatter {
    public interface ReportFormatter {
        String format(String title, String[] headers, String[][] rows);
    }

    class JsonFormatter implements ReportFormatter {
        @Override
        public String format(String title, String[] headers, String[][] rows) {
            StringBuilder sb = new StringBuilder();
            sb.append("{\n \"report\": \"").append(title).append("\",\n \"records\": [\n");
            for (int i = 0; i < rows.length; i++) {
                sb.append(" {");
                for (int j = 0; j < headers.length; j++) {
                    sb.append("\"").append(headers[j]).append("\"   : \"").append(rows[i][j]).append("\"");
                    if (j < headers.length - 1) sb.append(", ");
                }
                sb.append("}").append(i < rows.length - 1 ? ",\n" : "\n");
            }
            sb.append(" ]\n}");
            return sb.toString();

        }
    }

    class CsvFormatter implements my_formatter {
        @Override
        public String format(String title, String[] headers, String[][] rows) {
            String str = "Title :" + title + "/n" + String.join(",", headers);
            for (String[] row : rows) {
//            str+=String.join(",", row);
            }

            return str;
        }

    }

    interface Exporter {
    void export(String destination, String data);
}
    class BaseFileExporter implements Exporter{

    }
    abstract class ExporterDecorator implements Exporter{

    }
}

