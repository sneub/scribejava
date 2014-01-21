package org.scribe.oauth.core.model;

public class RequestToken
{
  private final String token;
  private final String secret;

  public RequestToken(String token, String secret)
  {
    this.token = token;
    this.secret = secret;
  }

  public String getToken()
  {
    return token;
  }

  public String getSecret()
  {
    return secret;
  }
}