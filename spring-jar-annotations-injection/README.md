### Annotation Injection Development Process  (Inversion of Control)
  
1. Habilitar componente a escanear a config file (container);  
``` <context:component-scan base-package="dev.evertonsavio.springdemo"></context:component-scan>```
  
2. Adicionar @Component Annotation na Java Class;   
  
3. Recuperar o Bean do container;  

### Constructor Injection P/ Dependecias  
  
1. Definir a dependecia criando a interface e a classe.  
    
2. Criar um construtor na sua classe para injections.  
  
3. Configurar a dependencia injection @Autowired Annotation  
  
### Setter Injection  

1. Criar o methodo setter na classe para injection  
  
2. Configurar as dependencias de injection com @Autowired Annotation  
  
### Field Injection com Java Reflection  
  
1. Configurar o Autowired diretamente no field / private Interface