package com.tencent.d.a.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec.Builder;
import com.tencent.d.a.c.c;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public abstract class a
{
  public static String[] L(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
      return (String[])paramArrayOfString.clone();
    }
    return paramArrayOfString;
  }
  
  public static a XC(String paramString)
  {
    if (com.tencent.d.a.a.cmi())
    {
      if (Build.VERSION.SDK_INT >= 23) {
        return new b(paramString, 4);
      }
      return new c(paramString, 4);
    }
    c.e("Soter.KeyGenParameterSpecCompatBuilder", "soter: not support soter. return dummy", new Object[0]);
    return new a();
  }
  
  public abstract a J(String... paramVarArgs);
  
  public abstract a K(String... paramVarArgs);
  
  public abstract AlgorithmParameterSpec cmp();
  
  public abstract a cmq();
  
  static final class a
    extends a
  {
    public final a J(String... paramVarArgs)
    {
      return null;
    }
    
    public final a K(String... paramVarArgs)
    {
      return null;
    }
    
    public final AlgorithmParameterSpec cmp()
    {
      return null;
    }
    
    public final a cmq()
    {
      return null;
    }
  }
  
  @TargetApi(23)
  private static final class b
    extends a
  {
    private KeyGenParameterSpec.Builder xBn = null;
    
    public b(String paramString, int paramInt)
    {
      this.xBn = new KeyGenParameterSpec.Builder(paramString, 4);
    }
    
    @SuppressLint({"WrongConstant"})
    public final a J(String... paramVarArgs)
    {
      this.xBn.setDigests(paramVarArgs);
      return this;
    }
    
    @SuppressLint({"WrongConstant"})
    public final a K(String... paramVarArgs)
    {
      this.xBn.setSignaturePaddings(paramVarArgs);
      return this;
    }
    
    public final AlgorithmParameterSpec cmp()
    {
      return this.xBn.build();
    }
    
    public final a cmq()
    {
      this.xBn.setUserAuthenticationRequired(true);
      return this;
    }
  }
  
  static final class c
    extends a
  {
    private String[] xBA;
    private String[] xBB;
    private String[] xBC;
    private boolean xBD = true;
    private boolean xBE;
    private int xBF = -1;
    private final String xBo;
    private int xBp;
    private int xBq = -1;
    private AlgorithmParameterSpec xBr;
    private X500Principal xBs;
    private BigInteger xBt;
    private Date xBu;
    private Date xBv;
    private Date xBw;
    private Date xBx;
    private Date xBy;
    private String[] xBz;
    
    public c(String paramString, int paramInt)
    {
      if (paramString == null) {
        throw new NullPointerException("keystoreAlias == null");
      }
      if (paramString.isEmpty()) {
        throw new IllegalArgumentException("keystoreAlias must not be empty");
      }
      this.xBo = paramString;
      this.xBp = 4;
    }
    
    public final a J(String... paramVarArgs)
    {
      this.xBz = L(paramVarArgs);
      return this;
    }
    
    public final a K(String... paramVarArgs)
    {
      this.xBB = L(paramVarArgs);
      return this;
    }
    
    public final AlgorithmParameterSpec cmp()
    {
      return (AlgorithmParameterSpec)Class.forName("android.security.keystore.KeyGenParameterSpec").getConstructor(new Class[] { String.class, Integer.TYPE, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, Date.class, Date.class, Date.class, Date.class, Date.class, Integer.TYPE, String[].class, String[].class, String[].class, String[].class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE }).newInstance(new Object[] { this.xBo, Integer.valueOf(this.xBq), this.xBr, this.xBs, this.xBt, this.xBu, this.xBv, this.xBw, this.xBx, this.xBy, Integer.valueOf(this.xBp), this.xBz, this.xBA, this.xBB, this.xBC, Boolean.valueOf(this.xBD), Boolean.valueOf(this.xBE), Integer.valueOf(this.xBF) });
    }
    
    public final a cmq()
    {
      this.xBE = true;
      return this;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */