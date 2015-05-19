

package commercewebservicescommons;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"OAuthAccessToken",
			"GenericItem",
			de.hybris.platform.commercewebservicescommons.jalo.OAuthAccessToken.class,
			"de.hybris.platform.persistence.commercewebservicescommons_OAuthAccessToken",
			false,
			null,
			false
		);
	
		createItemType(
			"OAuthRefreshToken",
			"GenericItem",
			de.hybris.platform.commercewebservicescommons.jalo.OAuthRefreshToken.class,
			"de.hybris.platform.persistence.commercewebservicescommons_OAuthRefreshToken",
			false,
			null,
			false
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_OAuthAccessToken_tokenId();
			
				single_createattr_OAuthAccessToken_token();
			
				single_createattr_OAuthAccessToken_authenticationId();
			
				single_createattr_OAuthAccessToken_userName();
			
				single_createattr_OAuthAccessToken_clientId();
			
				single_createattr_OAuthAccessToken_authentication();
			
				single_createattr_OAuthAccessToken_refreshToken();
			
				single_createattr_OAuthRefreshToken_tokenId();
			
				single_createattr_OAuthRefreshToken_token();
			
				single_createattr_OAuthRefreshToken_authentication();
			

	}

	
	public void single_createattr_OAuthAccessToken_tokenId() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"OAuthAccessToken", 
					"tokenId",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthAccessToken_token() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = new HashMap();
						
							sqlColumnDefinitions.put(
								"oracle",
								"BLOB"
							);
						
							sqlColumnDefinitions.put(
								de.hybris.platform.persistence.property.PersistenceManager.NO_DATABASE,
								"java.io.Serializable"
							);
						
				createPropertyAttribute(
					"OAuthAccessToken", 
					"token",  
					null,
					"java.lang.Object",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthAccessToken_authenticationId() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"OAuthAccessToken", 
					"authenticationId",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthAccessToken_userName() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"OAuthAccessToken", 
					"userName",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthAccessToken_clientId() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"OAuthAccessToken", 
					"clientId",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthAccessToken_authentication() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = new HashMap();
						
							sqlColumnDefinitions.put(
								"oracle",
								"BLOB"
							);
						
							sqlColumnDefinitions.put(
								de.hybris.platform.persistence.property.PersistenceManager.NO_DATABASE,
								"java.io.Serializable"
							);
						
				createPropertyAttribute(
					"OAuthAccessToken", 
					"authentication",  
					null,
					"java.lang.Object",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthAccessToken_refreshToken() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"OAuthAccessToken", 
					"refreshToken",  
					null,
					"OAuthRefreshToken",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthRefreshToken_tokenId() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"OAuthRefreshToken", 
					"tokenId",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthRefreshToken_token() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = new HashMap();
						
							sqlColumnDefinitions.put(
								"oracle",
								"BLOB"
							);
						
							sqlColumnDefinitions.put(
								de.hybris.platform.persistence.property.PersistenceManager.NO_DATABASE,
								"java.io.Serializable"
							);
						
				createPropertyAttribute(
					"OAuthRefreshToken", 
					"token",  
					null,
					"java.lang.Object",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_OAuthRefreshToken_authentication() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = new HashMap();
						
							sqlColumnDefinitions.put(
								"oracle",
								"BLOB"
							);
						
							sqlColumnDefinitions.put(
								de.hybris.platform.persistence.property.PersistenceManager.NO_DATABASE,
								"java.io.Serializable"
							);
						
				createPropertyAttribute(
					"OAuthRefreshToken", 
					"authentication",  
					null,
					"java.lang.Object",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"OAuthAccessToken",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_OAuthAccessToken_tokenId();
		
			single_setAttributeProperties_OAuthAccessToken_token();
		
			single_setAttributeProperties_OAuthAccessToken_authenticationId();
		
			single_setAttributeProperties_OAuthAccessToken_userName();
		
			single_setAttributeProperties_OAuthAccessToken_clientId();
		
			single_setAttributeProperties_OAuthAccessToken_authentication();
		
			single_setAttributeProperties_OAuthAccessToken_refreshToken();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"OAuthRefreshToken",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_OAuthRefreshToken_tokenId();
		
			single_setAttributeProperties_OAuthRefreshToken_token();
		
			single_setAttributeProperties_OAuthRefreshToken_authentication();
		
	}


		
						public void single_setAttributeProperties_OAuthAccessToken_tokenId() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"tokenId",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthAccessToken_token() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"token",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthAccessToken_authenticationId() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"authenticationId",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthAccessToken_userName() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"userName",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthAccessToken_clientId() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"clientId",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthAccessToken_authentication() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"authentication",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthAccessToken_refreshToken() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthAccessToken", 
								"refreshToken",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthRefreshToken_tokenId() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthRefreshToken", 
								"tokenId",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthRefreshToken_token() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthRefreshToken", 
								"token",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_OAuthRefreshToken_authentication() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"OAuthRefreshToken", 
								"authentication",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
}

	