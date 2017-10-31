package com.tencent.mm.plugin.backup.a;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a
{
  private static String TAG;
  private static LinkedList<a> jKI;
  
  static
  {
    GMTrace.i(14727845511168L, 109731);
    TAG = "MicroMsg.BackupBaseModel";
    jKI = new LinkedList();
    GMTrace.o(14727845511168L, 109731);
  }
  
  public a()
  {
    GMTrace.i(14727308640256L, 109727);
    GMTrace.o(14727308640256L, 109727);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(14727442857984L, 109728);
    jKI.add(parama);
    GMTrace.o(14727442857984L, 109728);
  }
  
  public static void adz()
  {
    GMTrace.i(14727577075712L, 109729);
    Iterator localIterator = jKI.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).adA();
    }
    jKI.clear();
    GMTrace.o(14727577075712L, 109729);
  }
  
  public abstract void adA();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */