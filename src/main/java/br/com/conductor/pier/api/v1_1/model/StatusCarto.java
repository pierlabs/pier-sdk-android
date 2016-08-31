package br.com.conductor.pier.api.v1_1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o")
public class StatusCarto  {
  
  @SerializedName("flagAlteraStatus")
  private Integer flagAlteraStatus = null;
  @SerializedName("flagCadastroNovaSenha")
  private Integer flagCadastroNovaSenha = null;
  @SerializedName("flagCancelaConta")
  private Integer flagCancelaConta = null;
  @SerializedName("flagCancelaNoDesbloqueio")
  private Integer flagCancelaNoDesbloqueio = null;
  @SerializedName("flagCobraTarifa")
  private Integer flagCobraTarifa = null;
  @SerializedName("flagDestinoTransferencia")
  private Integer flagDestinoTransferencia = null;
  @SerializedName("flagEmiteProvisorio")
  private Integer flagEmiteProvisorio = null;
  @SerializedName("flagExcecaoBandeira")
  private Integer flagExcecaoBandeira = null;
  @SerializedName("flagOrigemTransferencia")
  private Integer flagOrigemTransferencia = null;
  @SerializedName("flagReemiteCartao")
  private Integer flagReemiteCartao = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idStatusDestinoConta")
  private Long idStatusDestinoConta = null;
  @SerializedName("idStatusDestinoDesbloqueio")
  private Long idStatusDestinoDesbloqueio = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.")
  public Integer getFlagAlteraStatus() {
    return flagAlteraStatus;
  }
  public void setFlagAlteraStatus(Integer flagAlteraStatus) {
    this.flagAlteraStatus = flagAlteraStatus;
  }

  
  /**
   * Quando ativa, indica que a senha cadastrada ser\u00C3\u00A1 exclu\u00C3\u00ADda no momento do Bloqueio do cart\u00C3\u00A3o com um idStatusCartao que possua essa caracter\u00C3\u00ADstica, sendo ent\u00C3\u00A3o necess\u00C3\u00A1rio o cadastro de uma nova senha.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que a senha cadastrada ser\u00C3\u00A1 exclu\u00C3\u00ADda no momento do Bloqueio do cart\u00C3\u00A3o com um idStatusCartao que possua essa caracter\u00C3\u00ADstica, sendo ent\u00C3\u00A3o necess\u00C3\u00A1rio o cadastro de uma nova senha.")
  public Integer getFlagCadastroNovaSenha() {
    return flagCadastroNovaSenha;
  }
  public void setFlagCadastroNovaSenha(Integer flagCadastroNovaSenha) {
    this.flagCadastroNovaSenha = flagCadastroNovaSenha;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, e tal cart\u00C3\u00A3o seja de um titular (portador = 1), ter\u00C3\u00A3o a conta a qual o cart\u00C3\u00A3o pertence cancelada.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, e tal cart\u00C3\u00A3o seja de um titular (portador = 1), ter\u00C3\u00A3o a conta a qual o cart\u00C3\u00A3o pertence cancelada.")
  public Integer getFlagCancelaConta() {
    return flagCancelaConta;
  }
  public void setFlagCancelaConta(Integer flagCancelaConta) {
    this.flagCancelaConta = flagCancelaConta;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.
   **/
  @ApiModelProperty(value = "Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.")
  public Integer getFlagCancelaNoDesbloqueio() {
    return flagCancelaNoDesbloqueio;
  }
  public void setFlagCancelaNoDesbloqueio(Integer flagCancelaNoDesbloqueio) {
    this.flagCancelaNoDesbloqueio = flagCancelaNoDesbloqueio;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.")
  public Integer getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Integer flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.")
  public Integer getFlagDestinoTransferencia() {
    return flagDestinoTransferencia;
  }
  public void setFlagDestinoTransferencia(Integer flagDestinoTransferencia) {
    this.flagDestinoTransferencia = flagDestinoTransferencia;
  }

  
  /**
   * Quando ativa, indica que poder\u00C3\u00A1 ser criado um novo cart\u00C3\u00A3o provis\u00C3\u00B3rio para o portador.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que poder\u00C3\u00A1 ser criado um novo cart\u00C3\u00A3o provis\u00C3\u00B3rio para o portador.")
  public Integer getFlagEmiteProvisorio() {
    return flagEmiteProvisorio;
  }
  public void setFlagEmiteProvisorio(Integer flagEmiteProvisorio) {
    this.flagEmiteProvisorio = flagEmiteProvisorio;
  }

  
  /**
   * Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.")
  public Integer getFlagExcecaoBandeira() {
    return flagExcecaoBandeira;
  }
  public void setFlagExcecaoBandeira(Integer flagExcecaoBandeira) {
    this.flagExcecaoBandeira = flagExcecaoBandeira;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.")
  public Integer getFlagOrigemTransferencia() {
    return flagOrigemTransferencia;
  }
  public void setFlagOrigemTransferencia(Integer flagOrigemTransferencia) {
    this.flagOrigemTransferencia = flagOrigemTransferencia;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem este status atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o gerado para o portador, para a mesma conta, automaticamente.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem este status atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o gerado para o portador, para a mesma conta, automaticamente.")
  public Integer getFlagReemiteCartao() {
    return flagReemiteCartao;
  }
  public void setFlagReemiteCartao(Integer flagReemiteCartao) {
    this.flagReemiteCartao = flagReemiteCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) 
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) ")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.
   **/
  @ApiModelProperty(required = true, value = "Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.")
  public Long getIdStatusDestinoConta() {
    return idStatusDestinoConta;
  }
  public void setIdStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
  }

  
  /**
   * Indica qual o idStatusCartao que que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Indica qual o idStatusCartao que que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.")
  public Long getIdStatusDestinoDesbloqueio() {
    return idStatusDestinoDesbloqueio;
  }
  public void setIdStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCarto {\n");
    
    sb.append("  flagAlteraStatus: ").append(flagAlteraStatus).append("\n");
    sb.append("  flagCadastroNovaSenha: ").append(flagCadastroNovaSenha).append("\n");
    sb.append("  flagCancelaConta: ").append(flagCancelaConta).append("\n");
    sb.append("  flagCancelaNoDesbloqueio: ").append(flagCancelaNoDesbloqueio).append("\n");
    sb.append("  flagCobraTarifa: ").append(flagCobraTarifa).append("\n");
    sb.append("  flagDestinoTransferencia: ").append(flagDestinoTransferencia).append("\n");
    sb.append("  flagEmiteProvisorio: ").append(flagEmiteProvisorio).append("\n");
    sb.append("  flagExcecaoBandeira: ").append(flagExcecaoBandeira).append("\n");
    sb.append("  flagOrigemTransferencia: ").append(flagOrigemTransferencia).append("\n");
    sb.append("  flagReemiteCartao: ").append(flagReemiteCartao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idStatusDestinoConta: ").append(idStatusDestinoConta).append("\n");
    sb.append("  idStatusDestinoDesbloqueio: ").append(idStatusDestinoDesbloqueio).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


