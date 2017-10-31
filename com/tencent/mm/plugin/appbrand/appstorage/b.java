package com.tencent.mm.plugin.appbrand.appstorage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.g;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;

public final class b
  extends i<a>
{
  public static final String[] gMz;
  private e iDo;
  
  static
  {
    GMTrace.i(10634070589440L, 79230);
    gMz = new String[] { i.a(a.gLR, "AppBrandKVData"), "DROP TABLE IF EXISTS AppBrandStorageKVData;" };
    GMTrace.o(10634070589440L, 79230);
  }
  
  public b(e parame)
  {
    super(parame, a.gLR, "AppBrandKVData", null);
    GMTrace.i(10632728412160L, 79220);
    this.iDo = parame;
    GMTrace.o(10632728412160L, 79220);
  }
  
  private int Y(String paramString, int paramInt)
  {
    GMTrace.i(10633667936256L, 79227);
    paramInt = Math.max(0, oh(paramString) + paramInt);
    a locala = new a();
    locala.field_key = v(paramString, "@@@TOTAL@DATA@SIZE@@@", "++");
    locala.field_data = String.valueOf(paramInt);
    super.a(locala);
    GMTrace.o(10633667936256L, 79227);
    return paramInt;
  }
  
  private int oh(String paramString)
  {
    GMTrace.i(10633533718528L, 79226);
    a locala = new a();
    locala.field_key = v(paramString, "@@@TOTAL@DATA@SIZE@@@", "++");
    if (super.b(locala, new String[0]))
    {
      int i = bg.getInt(locala.field_data, 0);
      GMTrace.o(10633533718528L, 79226);
      return i;
    }
    GMTrace.o(10633533718528L, 79226);
    return 0;
  }
  
  private int oi(String paramString)
  {
    GMTrace.i(10633802153984L, 79228);
    paramString = this.iDo.a("AppBrandKVData", new String[] { "size" }, "key = ?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst())
    {
      int i = paramString.getInt(0);
      paramString.close();
      GMTrace.o(10633802153984L, 79228);
      return i;
    }
    paramString.close();
    GMTrace.o(10633802153984L, 79228);
    return 0;
  }
  
  private static String v(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10633936371712L, 79229);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString3);
    localStringBuilder.append(paramString2);
    paramString1 = localStringBuilder.toString();
    GMTrace.o(10633936371712L, 79229);
    return paramString1;
  }
  
  public final Object[] aB(String paramString1, String paramString2)
  {
    GMTrace.i(10632862629888L, 79221);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
    {
      paramString1 = a.iDr;
      GMTrace.o(10632862629888L, 79221);
      return new Object[] { paramString1 };
    }
    Object localObject = new a();
    ((a)localObject).field_key = v(paramString1, paramString2, "__");
    if (super.b((c)localObject, new String[0]))
    {
      paramString1 = a.iDp;
      paramString2 = ((a)localObject).field_data;
      localObject = ((a)localObject).field_dataType;
      GMTrace.o(10632862629888L, 79221);
      return new Object[] { paramString1, paramString2, localObject };
    }
    paramString1 = a.iDs;
    GMTrace.o(10632862629888L, 79221);
    return new Object[] { paramString1 };
  }
  
  public final a aC(String paramString1, String paramString2)
  {
    GMTrace.i(10633131065344L, 79223);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
    {
      paramString1 = a.iDr;
      GMTrace.o(10633131065344L, 79223);
      return paramString1;
    }
    paramString2 = v(paramString1, paramString2, "__");
    Y(paramString1, -oi(paramString2));
    paramString1 = new a();
    paramString1.field_key = paramString2;
    super.a(paramString1, new String[0]);
    paramString1 = a.iDp;
    GMTrace.o(10633131065344L, 79223);
    return paramString1;
  }
  
  public final void clear(String paramString)
  {
    GMTrace.i(10633265283072L, 79224);
    super.eL("AppBrandKVData", String.format("delete from %s where %s like '%s%%'", new Object[] { "AppBrandKVData", "key", paramString }));
    GMTrace.o(10633265283072L, 79224);
  }
  
  public final a e(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int k = 0;
    GMTrace.i(10632996847616L, 79222);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
    {
      paramString1 = a.iDr;
      GMTrace.o(10632996847616L, 79222);
      return paramString1;
    }
    String str = v(paramString1, paramString2, "__");
    int m = oi(str);
    int i;
    if (paramString2 == null)
    {
      i = 0;
      if (paramString3 != null) {
        break label134;
      }
    }
    label134:
    for (int j = 0;; j = paramString3.length())
    {
      j += i;
      m = j - m;
      i = k;
      if (oh(paramString1) + m >= g.oS(paramString1)) {
        i = 1;
      }
      if (i == 0) {
        break label143;
      }
      paramString1 = a.iDt;
      GMTrace.o(10632996847616L, 79222);
      return paramString1;
      i = paramString2.length();
      break;
    }
    label143:
    paramString2 = new a();
    paramString2.field_key = str;
    paramString2.field_data = paramString3;
    paramString2.field_dataType = paramString4;
    paramString2.field_size = j;
    if (super.a(paramString2))
    {
      Y(paramString1, m);
      paramString1 = a.iDp;
      GMTrace.o(10632996847616L, 79222);
      return paramString1;
    }
    paramString1 = a.iDq;
    GMTrace.o(10632996847616L, 79222);
    return paramString1;
  }
  
  public final Object[] og(String paramString)
  {
    GMTrace.i(10633399500800L, 79225);
    String str = paramString + "__";
    Object localObject1 = this.iDo;
    Object localObject2 = str.replace("_", "\\_") + "%";
    localObject1 = ((e)localObject1).a("AppBrandKVData", new String[] { "key" }, "key like ? escape ?", new String[] { localObject2, "\\" }, null, null, null, 2);
    localObject2 = new ArrayList();
    while (((Cursor)localObject1).moveToNext()) {
      ((ArrayList)localObject2).add(((Cursor)localObject1).getString(0).replace(str, ""));
    }
    ((Cursor)localObject1).close();
    int i = oh(paramString);
    int j = g.oS(paramString);
    GMTrace.o(10633399500800L, 79225);
    return new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(j) };
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10631923105792L, 79214);
      iDp = new a("NONE", 0);
      iDq = new a("UNKNOWN", 1);
      iDr = new a("MISSING_PARAMS", 2);
      iDs = new a("NO_SUCH_KEY", 3);
      iDt = new a("QUOTA_REACHED", 4);
      iDu = new a[] { iDp, iDq, iDr, iDs, iDt };
      GMTrace.o(10631923105792L, 79214);
    }
    
    private a()
    {
      GMTrace.i(10631788888064L, 79213);
      GMTrace.o(10631788888064L, 79213);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */