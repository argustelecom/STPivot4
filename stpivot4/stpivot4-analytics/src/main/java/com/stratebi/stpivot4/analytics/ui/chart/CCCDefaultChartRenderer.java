/*
 * ====================================================================
 * This software is subject to the terms of the Common Public License
 * Agreement, available at the following URL:
 *   http://www.opensource.org/licenses/cpl.html .
 * You must accept the terms of that agreement to use this software.
 * ====================================================================
 */
package com.stratebi.stpivot4.analytics.ui.chart;

import org.apache.commons.configuration.HierarchicalConfiguration;
import org.pivot4j.analytics.ui.chart.DefaultChartRenderer;

import java.io.Serializable;

public class CCCDefaultChartRenderer extends DefaultChartRenderer {

	private static final Position DEFAULT_TITLE_POSITION = Position.w;
	private static final int DEFAULT_TITLE_FONT_SIZE = 16;
	private static final String DEFAULT_TITLE_COLOR = "ADD8E6";
	private static final String DEFAULT_ORIENTATION = "vertical";
	private static final String DEFAULT_AXIS_X_TITLE = "";
	private static final String DEFAULT_AXIS_Y_TITLE = "";
	private static final boolean DEFAULT_AXIS_X_GRID = true;
	private static final boolean DEFAULT_AXIS_Y_GRID = true;
	private static final int DEFAULT_AXIS_X_MARGINS = 0;
	private static final int DEFAULT_AXIS_Y_MARGINS = 0;
	private static final boolean DEFAULT_SHOW_VALUES = true;
	private static final boolean DEFAULT_STACKED = false;
	private static final int DEFAULT_VALUES_FONT_SIZE = 10;
	private static final int DEFAULT_AXIS_LABEL_FONT_SIZE = 9;
	private static final boolean DEFAULT_DOTS_VISIBLE = false;
	private static final int DEFAULT_DOT_SHAPE_SIZE = 3;
	private static final String DEFAULT_DOT_SHAPE = "circle";

	private static final String TITLE_PROPERTY_NAME = "title";
	private static final String TITLEPOSITION_PROPERTY_NAME = "titlePosition";
	private static final String TITLEFONTSIZE_PROPERTY_NAME = "titleFontSize";
	private static final String TITLECOLOR_PROPERTY_NAME = "titleColor";
	private static final String ORIENTATION_PROPERTY_NAME = "orientation";
	private static final String AXISXTITLE_PROPERTY_NAME = "axisXTitle";
	private static final String AXISYTITLE_PROPERTY_NAME = "axisYTitle";
	private static final String AXISXGRID_PROPERTY_NAME = "axisXGrid";
	private static final String AXISYGRID_PROPERTY_NAME = "axisYGrid";
	private static final String AXISXMARGINS_PROPERTY_NAME = "axisXMargins";
	private static final String AXISYMARGINS_PROPERTY_NAME = "axisYMargins";
	private static final String SHOWVALUES_PROPERTY_NAME = "showValues";
	private static final String STACKED_PROPERTY_NAME = "stacked";
	private static final String VALUESFONTSIZE_PROPERTY_NAME = "valuesFontSize";
	private static final String AXISLABELFONTSIZE_PROPERTY_NAME = "axisLabelFontSize";
	private static final String DOTSVISIBLE_PROPERTY_NAME = "dotsVisible";
	private static final String DOTSHAPESIZE_PROPERTY_NAME = "dotShapeSize";
	private static final String DOTSHAPE_PROPERTY_NAME = "dotShape";

	private String title;
	private Position titlePosition = DEFAULT_TITLE_POSITION;
	private int titleFontSize = DEFAULT_TITLE_FONT_SIZE;
	private String titleColor = DEFAULT_TITLE_COLOR;
	private String orientation = DEFAULT_ORIENTATION;
	private String axisXTitle = DEFAULT_AXIS_X_TITLE;
	private String axisYTitle = DEFAULT_AXIS_Y_TITLE;
	private boolean axisXGrid = DEFAULT_AXIS_X_GRID;
	private boolean axisYGrid = DEFAULT_AXIS_Y_GRID;
	private int axisXMargins = DEFAULT_AXIS_X_MARGINS;
	private int axisYMargins = DEFAULT_AXIS_Y_MARGINS;
	private boolean showValues = DEFAULT_SHOW_VALUES;
	private boolean stacked = DEFAULT_STACKED;
	private int valuesFontSize = DEFAULT_VALUES_FONT_SIZE;
	private int axisLabelFontSize = DEFAULT_AXIS_LABEL_FONT_SIZE;
	private boolean dotsVisible = DEFAULT_DOTS_VISIBLE;
	private int dotShapeSize = DEFAULT_DOT_SHAPE_SIZE;
	private String dotShape = DEFAULT_DOT_SHAPE;

	@Override
	public Serializable saveState() {
		Serializable[] states = new Serializable[19];
		int index = 0;
		states[index++] = super.saveState();
		states[index++] = title;
		states[index++] = titlePosition.name();
		states[index++] = titleFontSize;
		states[index++] = titleColor;
		states[index++] = orientation;
		states[index++] = axisXTitle;
		states[index++] = axisYTitle;
		states[index++] = axisXGrid;
		states[index++] = axisYGrid;
		states[index++] = axisXMargins;
		states[index++] = axisYMargins;
		states[index++] = showValues;
		states[index++] = stacked;
		states[index++] = valuesFontSize;
		states[index++] = axisLabelFontSize;
		states[index++] = dotsVisible;
		states[index++] = dotShapeSize;
		states[index++] = dotShape;
	 	return states;
	}

	@Override
	public void restoreState(Serializable state) {
        Serializable[] states = (Serializable[]) state;
		int index = 0;
		super.restoreState(states[index++]);

		this.title = (String) states[index++];
		String position = (String) states[index++];
		this.titlePosition = position == null ? null : Position.valueOf(position);
		this.titleFontSize = (Integer) states[index++];
		this.titleColor = (String) states[index++];
		this.orientation = (String) states[index++];
		this.axisXTitle = (String) states[index++];
		this.axisYTitle = (String) states[index++];
		this.axisXGrid = (Boolean) states[index++];
		this.axisYGrid = (Boolean) states[index++];
		this.axisXMargins = (Integer) states[index++];
		this.axisYMargins = (Integer) states[index++];
		this.showValues = (Boolean) states[index++];
		this.stacked = (Boolean) states[index++];
		this.valuesFontSize = (Integer) states[index++];
		this.axisLabelFontSize = (Integer) states[index++];
		this.dotsVisible = (Boolean) states[index++];
		this.dotShapeSize = (Integer) states[index++];
		this.dotShape = (String) states[index++];
	}

	@Override
	public void saveSettings(HierarchicalConfiguration configuration) {
		super.saveSettings(configuration);

		configuration.addProperty(TITLE_PROPERTY_NAME, title);
		if (titlePosition != null)
			configuration.addProperty(TITLEPOSITION_PROPERTY_NAME, titlePosition.name());
		configuration.addProperty(TITLEFONTSIZE_PROPERTY_NAME, titleFontSize);
		configuration.addProperty(TITLECOLOR_PROPERTY_NAME, titleColor);
		configuration.addProperty(ORIENTATION_PROPERTY_NAME, orientation);
		configuration.addProperty(AXISXTITLE_PROPERTY_NAME, axisXTitle);
		configuration.addProperty(AXISYTITLE_PROPERTY_NAME, axisYTitle);
		configuration.addProperty(AXISXGRID_PROPERTY_NAME, axisXGrid);
		configuration.addProperty(AXISYGRID_PROPERTY_NAME, axisYGrid);
		configuration.addProperty(AXISXMARGINS_PROPERTY_NAME, axisXMargins);
		configuration.addProperty(AXISYMARGINS_PROPERTY_NAME, axisYMargins);
		configuration.addProperty(SHOWVALUES_PROPERTY_NAME, showValues);
		configuration.addProperty(STACKED_PROPERTY_NAME, stacked);
		configuration.addProperty(VALUESFONTSIZE_PROPERTY_NAME, valuesFontSize);
		configuration.addProperty(AXISLABELFONTSIZE_PROPERTY_NAME, axisLabelFontSize);
		configuration.addProperty(DOTSVISIBLE_PROPERTY_NAME, dotsVisible);
		configuration.addProperty(DOTSHAPESIZE_PROPERTY_NAME, dotShapeSize);
		configuration.addProperty(DOTSHAPE_PROPERTY_NAME, dotShape);
	}

	@Override
	public void restoreSettings(HierarchicalConfiguration configuration) {
		super.restoreSettings(configuration);

		this.title = configuration.getString(TITLE_PROPERTY_NAME, "");
		String position = configuration.getString(TITLEPOSITION_PROPERTY_NAME, DEFAULT_TITLE_POSITION.name());
		this.titlePosition =  Position.valueOf(position);
		this.titleFontSize = configuration.getInt(TITLEFONTSIZE_PROPERTY_NAME, DEFAULT_TITLE_FONT_SIZE);
		this.titleColor = configuration.getString(TITLECOLOR_PROPERTY_NAME, DEFAULT_TITLE_COLOR);
		this.orientation = configuration.getString(ORIENTATION_PROPERTY_NAME, DEFAULT_ORIENTATION);
		this.axisXTitle = configuration.getString(AXISXTITLE_PROPERTY_NAME, DEFAULT_AXIS_X_TITLE);
		this.axisYTitle = configuration.getString(AXISYTITLE_PROPERTY_NAME, DEFAULT_AXIS_Y_TITLE);
		this.axisXGrid = configuration.getBoolean(AXISXGRID_PROPERTY_NAME, DEFAULT_AXIS_X_GRID);
		this.axisYGrid = configuration.getBoolean(AXISYGRID_PROPERTY_NAME, DEFAULT_AXIS_Y_GRID);
		this.axisXMargins = configuration.getInt(AXISXMARGINS_PROPERTY_NAME, DEFAULT_AXIS_X_MARGINS);
		this.axisYMargins = configuration.getInt(AXISYMARGINS_PROPERTY_NAME, DEFAULT_AXIS_Y_MARGINS);
		this.showValues = configuration.getBoolean(SHOWVALUES_PROPERTY_NAME, DEFAULT_SHOW_VALUES);
		this.stacked = configuration.getBoolean(STACKED_PROPERTY_NAME, DEFAULT_STACKED);
		this.valuesFontSize = configuration.getInt(VALUESFONTSIZE_PROPERTY_NAME, DEFAULT_VALUES_FONT_SIZE);
		this.axisLabelFontSize = configuration.getInt(AXISLABELFONTSIZE_PROPERTY_NAME, DEFAULT_AXIS_LABEL_FONT_SIZE);
		this.dotsVisible = configuration.getBoolean(DOTSVISIBLE_PROPERTY_NAME, DEFAULT_DOTS_VISIBLE);
		this.dotShapeSize = configuration.getInt(DOTSHAPESIZE_PROPERTY_NAME, DEFAULT_DOT_SHAPE_SIZE);
		this.dotShape = configuration.getString(DOTSHAPE_PROPERTY_NAME, DEFAULT_DOT_SHAPE);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Position getTitlePosition() {
		return titlePosition;
	}

	public void setTitlePosition(Position titlePosition) {
		this.titlePosition = titlePosition;
	}

	public int getTitleFontSize() {
		return titleFontSize;
	}

	public void setTitleFontSize(int titleFontSize) {
		this.titleFontSize = titleFontSize;
	}

	public String getTitleColor() {
		return titleColor;
	}

	public void setTitleColor(String titleColor) {
		this.titleColor = titleColor;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getAxisXTitle() {
		return axisXTitle;
	}

	public void setAxisXTitle(String axisXTitle) {
		this.axisXTitle = axisXTitle;
	}

	public String getAxisYTitle() {
		return axisYTitle;
	}

	public void setAxisYTitle(String axisYTitle) {
		this.axisYTitle = axisYTitle;
	}

	public boolean isAxisXGrid() {
		return axisXGrid;
	}

	public void setAxisXGrid(boolean axisXGrid) {
		this.axisXGrid = axisXGrid;
	}

	public boolean isAxisYGrid() {
		return axisYGrid;
	}

	public void setAxisYGrid(boolean axisYGrid) {
		this.axisYGrid = axisYGrid;
	}

	public boolean isShowValues() {
		return showValues;
	}

	public void setShowValues(boolean showValues) {
		this.showValues = showValues;
	}

	public boolean isStacked() {
		return stacked;
	}

	public void setStacked(boolean stacked) {
		this.stacked = stacked;
	}

	public int getValuesFontSize() {
		return valuesFontSize;
	}

	public void setValuesFontSize(int valuesFontSize) {
		this.valuesFontSize = valuesFontSize;
	}

	public int getAxisLabelFontSize() {
		return axisLabelFontSize;
	}

	public void setAxisLabelFontSize(int axisLabelFontSize) {
		this.axisLabelFontSize = axisLabelFontSize;
	}

	public int getAxisXMargins() {
		return axisXMargins;
	}

	public void setAxisXMargins(int axisXMargins) {
		this.axisXMargins = axisXMargins;
	}

	public int getAxisYMargins() {
		return axisYMargins;
	}

	public void setAxisYMargins(int axisYMargins) {
		this.axisYMargins = axisYMargins;
	}

	public boolean isDotsVisible() {
		return dotsVisible;
	}

	public void setDotsVisible(boolean dotsVisible) {
		this.dotsVisible = dotsVisible;
	}

	public int getDotShapeSize() {
		return dotShapeSize;
	}

	public void setDotShapeSize(int dotShapeSize) {
		this.dotShapeSize = dotShapeSize;
	}

	public String getDotShape() {
		return dotShape;
	}

	public void setDotShape(String dotShape) {
		this.dotShape = dotShape;
	}


}
