<#ftl output_format="HTML" auto_esc=true>
<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>
    Welcome ${user!"visitor"}<#if user?? && user == "Big Joe">, our beloved leader</#if>!
  </h1>
  <#if latestProduct??>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  </p>
  </#if>
</body>
</html>