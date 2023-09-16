package in.nareshit.raghu.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class SamplePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(
			Map<String, Object> model, 
			Document document, 
			PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws Exception 
	{
		
		response.addHeader("Content-Disposition", "attachment;filename=sample.pdf");
		
		String title = (String) model.get("title");
		
		Paragraph p = new Paragraph(title);
		p.setSpacingAfter(25.0f);
		document.add(p);
		
		PdfPTable table = new PdfPTable(3);
		table.addCell("Slno");
		table.addCell("name");
		table.addCell("sal");
		
		table.addCell("101");
		table.addCell("AJAY");
		table.addCell("300.0");
		
		document.add(table);
		
	}
}
