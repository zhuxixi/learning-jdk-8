package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/InvalidTypeForEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u181/11358/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, July 7, 2018 1:04:12 AM PDT
*/

public final class InvalidTypeForEncoding extends org.omg.CORBA.UserException
{

  public InvalidTypeForEncoding ()
  {
    super(InvalidTypeForEncodingHelper.id());
  } // ctor


  public InvalidTypeForEncoding (String $reason)
  {
    super(InvalidTypeForEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidTypeForEncoding