package org.mobicents.protocols.ss7.tcap.api.tc.dialog.events;

import org.mobicents.protocols.ss7.tcap.asn.AbortSource;
import org.mobicents.protocols.ss7.tcap.asn.comp.PAbortCauseType;

/**
 * <pre>
 * -- NOTE � When the Abort Message is generated by the Transaction sublayer, a p-Abort Cause must be
 * -- present.The u-abortCause may be generated by the component sublayer in which case it is an ABRT
 * -- APDU, or by the TC-User in which case it could be either an ABRT APDU or data in some user-defined
 * -- abstract syntax.
 * </pre>
 * 
 * @author baranowb
 * 
 */
public interface TCPAbortIndication extends DialogIndication{

	
	//mandatory
	public PAbortCauseType getPAbortCause();
}
