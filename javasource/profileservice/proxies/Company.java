// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package profileservice.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Company
{
	private final IMendixObject companyMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "ProfileService.Company";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CompanyId("CompanyId"),
		CompanyName("CompanyName");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Company(IContext context)
	{
		this(context, Core.instantiate(context, "ProfileService.Company"));
	}

	protected Company(IContext context, IMendixObject companyMendixObject)
	{
		if (companyMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("ProfileService.Company", companyMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a ProfileService.Company");

		this.companyMendixObject = companyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Company.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static profileservice.proxies.Company initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return profileservice.proxies.Company.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static profileservice.proxies.Company initialize(IContext context, IMendixObject mendixObject)
	{
		return new profileservice.proxies.Company(context, mendixObject);
	}

	public static profileservice.proxies.Company load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return profileservice.proxies.Company.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of CompanyId
	 */
	public final String getCompanyId()
	{
		return getCompanyId(getContext());
	}

	/**
	 * @param context
	 * @return value of CompanyId
	 */
	public final String getCompanyId(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CompanyId.toString());
	}

	/**
	 * Set value of CompanyId
	 * @param companyid
	 */
	public final void setCompanyId(String companyid)
	{
		setCompanyId(getContext(), companyid);
	}

	/**
	 * Set value of CompanyId
	 * @param context
	 * @param companyid
	 */
	public final void setCompanyId(IContext context, String companyid)
	{
		getMendixObject().setValue(context, MemberNames.CompanyId.toString(), companyid);
	}

	/**
	 * @return value of CompanyName
	 */
	public final String getCompanyName()
	{
		return getCompanyName(getContext());
	}

	/**
	 * @param context
	 * @return value of CompanyName
	 */
	public final String getCompanyName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CompanyName.toString());
	}

	/**
	 * Set value of CompanyName
	 * @param companyname
	 */
	public final void setCompanyName(String companyname)
	{
		setCompanyName(getContext(), companyname);
	}

	/**
	 * Set value of CompanyName
	 * @param context
	 * @param companyname
	 */
	public final void setCompanyName(IContext context, String companyname)
	{
		getMendixObject().setValue(context, MemberNames.CompanyName.toString(), companyname);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return companyMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final profileservice.proxies.Company that = (profileservice.proxies.Company) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "ProfileService.Company";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
