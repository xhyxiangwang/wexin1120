package org.a.e;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.a.c.e;
import org.a.c.f;
import org.a.d.i;
import org.a.d.j;
import org.a.d.k;

public final class a
  implements b
{
  private org.a.d.a xVJ;
  private org.a.a.a.b xVK;
  
  public a(org.a.a.a.b paramb, org.a.d.a parama)
  {
    this.xVK = paramb;
    this.xVJ = parama;
  }
  
  private void a(org.a.d.c paramc, i parami)
  {
    paramc.fz("oauth_timestamp", new org.a.f.d().cqu());
    paramc.fz("oauth_nonce", new org.a.f.d().getNonce());
    paramc.fz("oauth_consumer_key", this.xVJ.xVc);
    paramc.fz("oauth_signature_method", new org.a.f.a().cqt());
    paramc.fz("oauth_version", "1.0");
    if (this.xVJ.scope != null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        paramc.fz("scope", this.xVJ.scope);
      }
      this.xVJ.xd("generating signature...");
      String str = new org.a.c.c().a(paramc);
      parami = new org.a.f.a().al(str, this.xVJ.xVd, parami.uih);
      this.xVJ.xd("base string is: " + str);
      this.xVJ.xd("signature is: " + parami);
      paramc.fz("oauth_signature", parami);
      this.xVJ.xd("appended additional OAuth parameters: " + org.a.g.b.ar(paramc.xVl));
      return;
    }
  }
  
  private void b(org.a.d.c paramc)
  {
    switch (cqs()[this.xVJ.xVg.ordinal()])
    {
    }
    for (;;)
    {
      return;
      this.xVJ.xd("using Http Header signature");
      paramc.addHeader("Authorization", new e().a(paramc));
      return;
      this.xVJ.xd("using Querystring signature");
      Iterator localIterator = paramc.xVl.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramc.fA((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }
  
  public final i a(i parami, k paramk)
  {
    this.xVJ.xd("obtaining access token from " + this.xVK.cqh());
    org.a.d.c localc = new org.a.d.c(j.xVB, this.xVK.cqh());
    localc.fz("oauth_token", parami.token);
    localc.fz("oauth_verifier", paramk.value);
    this.xVJ.xd("setting token to: " + parami + " and verifier to: " + paramk);
    a(localc, parami);
    b(localc);
    parami = localc.cqm();
    return new org.a.c.g().Yq(parami.getBody());
  }
  
  public final void a(i parami, org.a.d.c paramc)
  {
    this.xVJ.xd("signing request: " + paramc.cqk());
    if (("".equals(parami.token)) && ("".equals(parami.uih))) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        paramc.fz("oauth_token", parami.token);
      }
      this.xVJ.xd("setting token to: " + parami);
      a(paramc, parami);
      b(paramc);
      return;
    }
  }
  
  public final String b(i parami)
  {
    return this.xVK.b(parami);
  }
  
  public final i cqr()
  {
    this.xVJ.xd("obtaining request token from " + this.xVK.cqg());
    Object localObject = new org.a.d.c(j.xVB, this.xVK.cqg());
    this.xVJ.xd("setting oauth_callback to " + this.xVJ.xVe);
    ((org.a.d.c)localObject).fz("oauth_callback", this.xVJ.xVe);
    a((org.a.d.c)localObject, org.a.d.b.xVk);
    b((org.a.d.c)localObject);
    this.xVJ.xd("sending request...");
    localObject = ((org.a.d.c)localObject).cqm();
    String str = ((org.a.d.g)localObject).getBody();
    this.xVJ.xd("response status code: " + ((org.a.d.g)localObject).code);
    this.xVJ.xd("response body: " + str);
    return new org.a.c.g().Yq(str);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */