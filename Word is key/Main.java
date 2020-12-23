i=("break","case", "continue", "default","defer","else","for","func","goto","if","map","range","return","struct","type","var")
ip=str(input())
if ip in i:
  print(ip,"is a keyword")
else:
  print(ip,"is not a keyword")