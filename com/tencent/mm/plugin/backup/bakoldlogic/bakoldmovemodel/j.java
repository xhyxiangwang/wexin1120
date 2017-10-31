package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.k;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ef;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import java.util.LinkedList;

public final class j
  extends k
  implements com.tencent.mm.network.j
{
  private com.tencent.mm.ac.e gMF;
  public com.tencent.mm.network.p hne;
  
  public j(LinkedList<nh> paramLinkedList, String paramString)
  {
    GMTrace.i(14743280549888L, 109846);
    this.hne = new a();
    final com.tencent.mm.protocal.j.a locala = (com.tencent.mm.protocal.j.a)this.hne.DC();
    locala.tpB = com.tencent.mm.plugin.backup.a.e.adK();
    locala.tpA.tyc = paramLinkedList.size();
    locala.tpA.tyd = paramLinkedList;
    locala.tpA.tye = com.tencent.mm.compatible.d.p.getDeviceID(ab.getContext());
    locala.tpA.tyf = m.zF();
    locala.tpA.ttY = 2;
    locala.tpA.jXk = 0L;
    locala.tpA.tyg = paramString;
    locala.tpA.tyh = a.aft().jTw;
    locala.tpK = locala.tpB;
    locala.tpJ = new k.a()
    {
      public final boolean a(PByteArray paramAnonymousPByteArray, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2, int paramAnonymousInt2)
      {
        GMTrace.i(14752004702208L, 109911);
        long l = locala.tpD;
        if ((b.bMv()) && (l == 0L)) {
          l = d.toW;
        }
        for (;;)
        {
          ac localac = locala.tpL;
          if (paramAnonymousInt1 == 1000)
          {
            byte[] arrayOfByte = locala.tpK;
            w.d("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "BakMove key:" + arrayOfByte);
            if (!localac.bLw()) {
              arrayOfByte = new byte[0];
            }
            if (bg.bp(arrayOfByte))
            {
              w.e("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramAnonymousInt1) });
              GMTrace.o(14752004702208L, 109911);
              return false;
            }
            if (MMProtocalJni.pack(locala.Bb(), paramAnonymousPByteArray, arrayOfByte, paramAnonymousArrayOfByte1, locala.tpG, (int)l, 1000, localac.ver, localac.tqw.getBytes(), localac.tqx.getBytes(), paramAnonymousArrayOfByte2, paramAnonymousInt2))
            {
              w.d("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramAnonymousPByteArray.value.length), Integer.valueOf(paramAnonymousInt2) });
              GMTrace.o(14752004702208L, 109911);
              return true;
            }
          }
          GMTrace.o(14752004702208L, 109911);
          return false;
        }
      }
    };
    GMTrace.o(14743280549888L, 109846);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(14743414767616L, 109847);
    this.gMF = parame1;
    int i = a(parame, this.hne, this);
    GMTrace.o(14743414767616L, 109847);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(14743548985344L, 109848);
    w.i("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(14743548985344L, 109848);
      return;
    }
    w.i("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "onGYNetEnd QRCodeUrl:%s", new Object[] { ((j.b)paramp.Ba()).tpC.tyk });
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14743548985344L, 109848);
  }
  
  public final int getType()
  {
    GMTrace.i(14743683203072L, 109849);
    GMTrace.o(14743683203072L, 109849);
    return 1000;
  }
  
  public static final class a
    extends i
  {
    private final j.b jOA;
    private final com.tencent.mm.protocal.j.a jOz;
    
    public a()
    {
      GMTrace.i(14754957492224L, 109933);
      this.jOz = new com.tencent.mm.protocal.j.a();
      this.jOA = new j.b();
      GMTrace.o(14754957492224L, 109933);
    }
    
    protected final k.d AZ()
    {
      GMTrace.i(14755091709952L, 109934);
      com.tencent.mm.protocal.j.a locala = this.jOz;
      GMTrace.o(14755091709952L, 109934);
      return locala;
    }
    
    public final k.e Ba()
    {
      GMTrace.i(14755225927680L, 109935);
      j.b localb = this.jOA;
      GMTrace.o(14755225927680L, 109935);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(14755628580864L, 109938);
      GMTrace.o(14755628580864L, 109938);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(14755360145408L, 109936);
      GMTrace.o(14755360145408L, 109936);
      return 1000;
    }
    
    public final String getUri()
    {
      GMTrace.i(14755494363136L, 109937);
      GMTrace.o(14755494363136L, 109937);
      return "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */