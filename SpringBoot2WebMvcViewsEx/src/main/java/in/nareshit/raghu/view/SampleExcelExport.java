package in.nareshit.raghu.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class SampleExcelExport extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(
			Map<String, Object> model, 
			Workbook workbook, 
			HttpServletRequest request,
			HttpServletResponse response) 
					throws Exception {
		
		response.addHeader("Content-Disposition", "attachment;filename=samples.xls");
		
		Sheet sheet = workbook.createSheet("TEST ONE");
		
		Row r1 = sheet.createRow(0);
		r1.createCell(0).setCellValue("Sl.No");
		r1.createCell(1).setCellValue("NAME");
		r1.createCell(2).setCellValue("CODE");
		
		Row r2 = sheet.createRow(1);
		r2.createCell(0).setCellValue("101");
		r2.createCell(1).setCellValue("AJAY");
		r2.createCell(2).setCellValue("AA-7459");
		
		String message = (String) model.get("title");
		Row r3 = sheet.createRow(2);
		r3.createCell(3).setCellValue(message);
	}
}
