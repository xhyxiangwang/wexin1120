package com.tencent.mm.plugin.sns.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.s;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public static d qkP;
  public s gCo;
  public int gNq;
  public HashMap<String, Integer> qkQ;
  public int qkR;
  public int qkS;
  
  static
  {
    GMTrace.i(8882529239040L, 66180);
    qkP = new d();
    GMTrace.o(8882529239040L, 66180);
  }
  
  private d()
  {
    GMTrace.i(8882260803584L, 66178);
    this.qkR = 200;
    this.qkS = 86400;
    this.gNq = 0;
    Object localObject = com.tencent.mm.x.c.c.Cu().em("100077");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bPn();
      this.qkR = bg.getInt((String)((Map)localObject).get("maxCacheFeedCount"), 200);
      this.qkS = bg.getInt((String)((Map)localObject).get("maxCacheSeconds"), 86400);
      this.gNq = bg.getInt((String)((Map)localObject).get("needUploadData"), 0);
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsReportHelper", "initAbtestArg maxCacheFeedCount:%d, maxCacheSeconds:%d, needUploadData:%d", new Object[] { Integer.valueOf(this.qkR), Integer.valueOf(this.qkS), Integer.valueOf(this.gNq) });
    this.gCo = new s(com.tencent.mm.storage.w.gZP + "snsreport.cfg");
    localObject = this.gCo.get(3, new HashMap());
    if (!(localObject instanceof HashMap))
    {
      FileOp.deleteFile(com.tencent.mm.storage.w.gZP + "snsreport.cfg");
      this.qkQ = new HashMap();
      GMTrace.o(8882260803584L, 66178);
      return;
    }
    this.qkQ = ((HashMap)localObject);
    GMTrace.o(8882260803584L, 66178);
  }
  
  public final void Hm(String paramString)
  {
    GMTrace.i(8882395021312L, 66179);
    if (this.gNq == 0)
    {
      GMTrace.o(8882395021312L, 66179);
      return;
    }
    HashMap localHashMap = this.qkQ;
    if (this.qkQ.containsKey(paramString)) {}
    for (int i = ((Integer)this.qkQ.get(paramString)).intValue() + 1;; i = 1)
    {
      localHashMap.put(paramString, Integer.valueOf(i));
      GMTrace.o(8882395021312L, 66179);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */