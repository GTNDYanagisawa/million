/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/05/18 13:25:55                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.fraud.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.fraud.model.FraudReportModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type FraudSymptomScoring first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class FraudSymptomScoringModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FraudSymptomScoring";
	
	/**<i>Generated relation code constant for relation <code>FraudReportFraudSymptomScoringRelation</code> defining source attribute <code>fraudReport</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _FRAUDREPORTFRAUDSYMPTOMSCORINGRELATION = "FraudReportFraudSymptomScoringRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudSymptomScoring.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudSymptomScoring.score</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String SCORE = "score";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudSymptomScoring.explanation</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String EXPLANATION = "explanation";
	
	/** <i>Generated constant</i> - Attribute key of <code>FraudSymptomScoring.fraudReport</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FRAUDREPORT = "fraudReport";
	
	
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.name</code> attribute defined at extension <code>basecommerce</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.score</code> attribute defined at extension <code>basecommerce</code>. */
	private Double _score;
	
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.explanation</code> attribute defined at extension <code>basecommerce</code>. */
	private String _explanation;
	
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.fraudReport</code> attribute defined at extension <code>basecommerce</code>. */
	private FraudReportModel _fraudReport;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public FraudSymptomScoringModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public FraudSymptomScoringModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _fraudReport initial attribute declared by type <code>FraudSymptomScoring</code> at extension <code>basecommerce</code>
	 * @param _name initial attribute declared by type <code>FraudSymptomScoring</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public FraudSymptomScoringModel(final FraudReportModel _fraudReport, final String _name)
	{
		super();
		setFraudReport(_fraudReport);
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _fraudReport initial attribute declared by type <code>FraudSymptomScoring</code> at extension <code>basecommerce</code>
	 * @param _name initial attribute declared by type <code>FraudSymptomScoring</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public FraudSymptomScoringModel(final FraudReportModel _fraudReport, final String _name, final ItemModel _owner)
	{
		super();
		setFraudReport(_fraudReport);
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudSymptomScoring.explanation</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the explanation
	 */
	public String getExplanation()
	{
		if (this._explanation!=null)
		{
			return _explanation;
		}
		return _explanation = getPersistenceContext().getValue(EXPLANATION, _explanation);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudSymptomScoring.fraudReport</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the fraudReport
	 */
	public FraudReportModel getFraudReport()
	{
		if (this._fraudReport!=null)
		{
			return _fraudReport;
		}
		return _fraudReport = getPersistenceContext().getValue(FRAUDREPORT, _fraudReport);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudSymptomScoring.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FraudSymptomScoring.score</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the score
	 */
	public double getScore()
	{
		return toPrimitive( _score = getPersistenceContext().getValue(SCORE, _score));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FraudSymptomScoring.explanation</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the explanation
	 */
	public void setExplanation(final String value)
	{
		_explanation = getPersistenceContext().setValue(EXPLANATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FraudSymptomScoring.fraudReport</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the fraudReport
	 */
	public void setFraudReport(final FraudReportModel value)
	{
		_fraudReport = getPersistenceContext().setValue(FRAUDREPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FraudSymptomScoring.name</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FraudSymptomScoring.score</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the score
	 */
	public void setScore(final double value)
	{
		_score = getPersistenceContext().setValue(SCORE, toObject(value));
	}
	
}
