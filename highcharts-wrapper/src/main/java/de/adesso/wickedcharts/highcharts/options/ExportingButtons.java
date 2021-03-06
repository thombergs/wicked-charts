/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines the configurations fot the buttons option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#exporting.buttons">http://api.highcharts.com/highcharts#exporting.buttons</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ExportingButtons implements Serializable {

  private static final long serialVersionUID = 1L;

	private ButtonOptions exportButton;

	private ButtonOptions printButton;

	private ButtonOptions contextButton;

	public ButtonOptions getExportButton() {
		return this.exportButton;
	}

	public ButtonOptions getPrintButton() {
		return this.printButton;
	}

	public ButtonOptions getContextButton() {
		return this.contextButton;
	}

	public ExportingButtons setExportButton(final ButtonOptions exportButton) {
		this.exportButton = exportButton;
		return this;
	}

	public ExportingButtons setPrintButton(final ButtonOptions printButton) {
		this.printButton = printButton;
		return this;
	}

	public ExportingButtons setContextButton(final ButtonOptions contextButton) {
		this.contextButton = contextButton;
		return this;
	}

}
