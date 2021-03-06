package org.contineo.core.text.parser;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author Michael Scholz
 */
public class HTMLParser implements Parser {
	private String content = "";

	protected static Log logger = LogFactory.getLog(HTMLParser.class);

	public void parse(File file) {
		final StringBuffer buffer = new StringBuffer();
		try {
			HTMLEditorKit.ParserCallback callback = new HTMLEditorKit.ParserCallback() {
				public void handleText(char[] data, int pos) {
					buffer.append(data);
				} // end method handleText
			};

			Reader reader = new FileReader(file);
			new ParserDelegator().parse(reader, callback, true);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		}
		content = buffer.toString();
	}

	public String getContent() {
		return content;
	}

	public String getVersion() {
		return "";
	}

	/**
	 * @see org.contineo.core.text.parser.Parser#getAuthor()
	 */
	public String getAuthor() {
		return "";
	}

	/**
	 * @see org.contineo.core.text.parser.Parser#getSourceDate()
	 */
	public String getSourceDate() {
		return "";
	}

	/**
	 * @see org.contineo.core.text.parser.Parser#getKeywords()
	 */
	public String getKeywords() {
		return "";
	}

	/**
	 * @see org.contineo.core.text.parser.Parser#getTitle()
	 */
	public String getTitle() {
		return "";
	}
}