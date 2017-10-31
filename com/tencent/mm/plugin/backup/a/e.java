package com.tencent.mm.plugin.backup.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public abstract class e
  extends a
{
  private static String TAG;
  private static boolean gQr;
  private static int jLd;
  private static byte[] jLe;
  private static SharedPreferences jLg;
  public String jKZ;
  public String jLa;
  public String jLb;
  public f jLc;
  public byte[] jLf;
  
  static
  {
    GMTrace.i(14722208366592L, 109689);
    TAG = "MicroMsg.BackupModel";
    jLd = 0;
    jLe = "key".getBytes();
    gQr = false;
    GMTrace.o(14722208366592L, 109689);
  }
  
  public e()
  {
    GMTrace.i(14720463536128L, 109676);
    this.jKZ = "id";
    this.jLa = "hello";
    this.jLb = "ok";
    GMTrace.o(14720463536128L, 109676);
  }
  
  public static void P(byte[] paramArrayOfByte)
  {
    GMTrace.i(14721537277952L, 109684);
    jLe = paramArrayOfByte;
    GMTrace.o(14721537277952L, 109684);
  }
  
  public static int adJ()
  {
    GMTrace.i(14721134624768L, 109681);
    int i = jLd;
    GMTrace.o(14721134624768L, 109681);
    return i;
  }
  
  public static byte[] adK()
  {
    GMTrace.i(14721403060224L, 109683);
    byte[] arrayOfByte = jLe;
    GMTrace.o(14721403060224L, 109683);
    return arrayOfByte;
  }
  
  public static SharedPreferences adL()
  {
    GMTrace.i(14721671495680L, 109685);
    if (jLg == null) {
      jLg = ab.getContext().getSharedPreferences("BACKUP_CONFIG", 4);
    }
    SharedPreferences localSharedPreferences = jLg;
    GMTrace.o(14721671495680L, 109685);
    return localSharedPreferences;
  }
  
  public static void adM()
  {
    GMTrace.i(14721805713408L, 109686);
    w.i(TAG, "holdReset");
    gQr = true;
    GMTrace.o(14721805713408L, 109686);
  }
  
  public static boolean adN()
  {
    GMTrace.i(14721939931136L, 109687);
    boolean bool = gQr;
    GMTrace.o(14721939931136L, 109687);
    return bool;
  }
  
  public static void adO()
  {
    GMTrace.i(14722074148864L, 109688);
    jLe = "key".getBytes();
    jLd = 0;
    jLg = null;
    gQr = false;
    GMTrace.o(14722074148864L, 109688);
  }
  
  public static void km(int paramInt)
  {
    GMTrace.i(14721268842496L, 109682);
    jLd = paramInt;
    GMTrace.o(14721268842496L, 109682);
  }
  
  public final f adG()
  {
    GMTrace.i(14720597753856L, 109677);
    if (this.jLc == null) {
      this.jLc = new f();
    }
    f localf = this.jLc;
    GMTrace.o(14720597753856L, 109677);
    return localf;
  }
  
  public abstract void adH();
  
  public abstract void adI();
  
  public abstract void i(Object... paramVarArgs);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */