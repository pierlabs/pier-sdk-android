package br.com.conductor.pier.api.v1_1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o")
public class StatusCarto  {
  
  @SerializedName("flagAlteraStatus")
  private String flagAlteraStatus = null;
  @SerializedName("flagCadastroNovaSenha")
  private String flagCadastroNovaSenha = null;
  @SerializedName("flagCadastroSenha")
  private String flagCadastroSenha = null;
  @SerializedName("flagCancelaCartao")
  private String flagCancelaCartao = null;
  @SerializedName("flagCancelaConta")
  private String flagCancelaConta = null;
  @SerializedName("flagCobraTarifa")
  private String flagCobraTarifa = null;
  @SerializedName("flagDesbloqueio")
  private String flagDesbloqueio = null;
  @SerializedName("flagDestinoTransferencia")
  private String flagDestinoTransferencia = null;
  @SerializedName("flagEmiteProvisorio")
  private String flagEmiteProvisorio = null;
  @SerializedName("flagExcecaoBandeira")
  private String flagExcecaoBandeira = null;
  @SerializedName("flagOrigemTransferencia")
  private String flagOrigemTransferencia = null;
  @SerializedName("flagReemiteCartao")
  private String flagReemiteCartao = null;
  @SerializedName("flagReversaoCancelamento")
  private String flagReversaoCancelamento = null;
  @SerializedName("flagReversaoDesbloqueio")
  private String flagReversaoDesbloqueio = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idStatusDestinoConta")
  private Long idStatusDestinoConta = null;
  @SerializedName("idStatusDestinoDesbloqueio")
  private Long idStatusDestinoDesbloqueio = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * Quanto ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo n\u00C3\u00A3o ter\u00C3\u00A3o seu idStatusCartao Alterado, fazendo com que o Cart\u00C3\u00A3o atual possa continuar sendo utilizado at\u00C3\u00A9 o desbloqueio de um novo cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Quanto ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo n\u00C3\u00A3o ter\u00C3\u00A3o seu idStatusCartao Alterado, fazendo com que o Cart\u00C3\u00A3o atual possa continuar sendo utilizado at\u00C3\u00A9 o desbloqueio de um novo cart\u00C3\u00A3o.")
  public String getFlagAlteraStatus() {
    return flagAlteraStatus;
  }
  public void setFlagAlteraStatus(String flagAlteraStatus) {
    this.flagAlteraStatus = flagAlteraStatus;
  }

  
  /**
   * Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a senha atual exclu\u00C3\u00ADda.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a senha atual exclu\u00C3\u00ADda.")
  public String getFlagCadastroNovaSenha() {
    return flagCadastroNovaSenha;
  }
  public void setFlagCadastroNovaSenha(String flagCadastroNovaSenha) {
    this.flagCadastroNovaSenha = flagCadastroNovaSenha;
  }

  
  /**
   * Quando ativa, indica se poder\u00C3\u00A1 ser realizado o cadastro de uma senha para o Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica se poder\u00C3\u00A1 ser realizado o cadastro de uma senha para o Cart\u00C3\u00A3o.")
  public String getFlagCadastroSenha() {
    return flagCadastroSenha;
  }
  public void setFlagCadastroSenha(String flagCadastroSenha) {
    this.flagCadastroSenha = flagCadastroSenha;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o o cart\u00C3\u00A3o Cancelado.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o o cart\u00C3\u00A3o Cancelado.")
  public String getFlagCancelaCartao() {
    return flagCancelaCartao;
  }
  public void setFlagCancelaCartao(String flagCancelaCartao) {
    this.flagCancelaCartao = flagCancelaCartao;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a conta Cancelada.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a conta Cancelada.")
  public String getFlagCancelaConta() {
    return flagCancelaConta;
  }
  public void setFlagCancelaConta(String flagCancelaConta) {
    this.flagCancelaConta = flagCancelaConta;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a cobran\u00C3\u00A7a de tarifa lan\u00C3\u00A7ada junto a gera\u00C3\u00A7\u00C3\u00A3o do novo cart\u00C3\u00A3o, desde que o Produto ao qual o cart\u00C3\u00A3o pertence possua o respectivo par\u00C3\u00A2metro configurado.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a cobran\u00C3\u00A7a de tarifa lan\u00C3\u00A7ada junto a gera\u00C3\u00A7\u00C3\u00A3o do novo cart\u00C3\u00A3o, desde que o Produto ao qual o cart\u00C3\u00A3o pertence possua o respectivo par\u00C3\u00A2metro configurado.")
  public String getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(String flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao poder\u00C3\u00A3o ser Desbloqueados.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao poder\u00C3\u00A3o ser Desbloqueados.")
  public String getFlagDesbloqueio() {
    return flagDesbloqueio;
  }
  public void setFlagDesbloqueio(String flagDesbloqueio) {
    this.flagDesbloqueio = flagDesbloqueio;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.")
  public String getFlagDestinoTransferencia() {
    return flagDestinoTransferencia;
  }
  public void setFlagDestinoTransferencia(String flagDestinoTransferencia) {
    this.flagDestinoTransferencia = flagDestinoTransferencia;
  }

  
  /**
   * Quando ativa, indica que os portadores que tiverem seus cart\u00C3\u00B5es associados a idStatusCartao com esta flag poder\u00C3\u00A3o solicitar a emiss\u00C3\u00A3o de um cart\u00C3\u00A3o provis\u00C3\u00B3rio at\u00C3\u00A9 que um novo cart\u00C3\u00A3o definitivo seja recebido. 
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que os portadores que tiverem seus cart\u00C3\u00B5es associados a idStatusCartao com esta flag poder\u00C3\u00A3o solicitar a emiss\u00C3\u00A3o de um cart\u00C3\u00A3o provis\u00C3\u00B3rio at\u00C3\u00A9 que um novo cart\u00C3\u00A3o definitivo seja recebido. ")
  public String getFlagEmiteProvisorio() {
    return flagEmiteProvisorio;
  }
  public void setFlagEmiteProvisorio(String flagEmiteProvisorio) {
    this.flagEmiteProvisorio = flagEmiteProvisorio;
  }

  
  /**
   * Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.")
  public String getFlagExcecaoBandeira() {
    return flagExcecaoBandeira;
  }
  public void setFlagExcecaoBandeira(String flagExcecaoBandeira) {
    this.flagExcecaoBandeira = flagExcecaoBandeira;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.")
  public String getFlagOrigemTransferencia() {
    return flagOrigemTransferencia;
  }
  public void setFlagOrigemTransferencia(String flagOrigemTransferencia) {
    this.flagOrigemTransferencia = flagOrigemTransferencia;
  }

  
  /**
   * Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o automaticamente gerado.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o automaticamente gerado.")
  public String getFlagReemiteCartao() {
    return flagReemiteCartao;
  }
  public void setFlagReemiteCartao(String flagReemiteCartao) {
    this.flagReemiteCartao = flagReemiteCartao;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido cancelado, poder\u00C3\u00A1 ter o processo desfeito.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido cancelado, poder\u00C3\u00A1 ter o processo desfeito.")
  public String getFlagReversaoCancelamento() {
    return flagReversaoCancelamento;
  }
  public void setFlagReversaoCancelamento(String flagReversaoCancelamento) {
    this.flagReversaoCancelamento = flagReversaoCancelamento;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido bloqueado, poder\u00C3\u00A1 ter o processo desfeito.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido bloqueado, poder\u00C3\u00A1 ter o processo desfeito.")
  public String getFlagReversaoDesbloqueio() {
    return flagReversaoDesbloqueio;
  }
  public void setFlagReversaoDesbloqueio(String flagReversaoDesbloqueio) {
    this.flagReversaoDesbloqueio = flagReversaoDesbloqueio;
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
   * Indica qual o idStatusConta que ser\u00C3\u00A1 atribu\u00C3\u00ADdo ao idConta que tiver o Cartao do titular da mesma cancelado por um idStatusCartao que recomenda o cancelamento da conta.
   **/
  @ApiModelProperty(required = true, value = "Indica qual o idStatusConta que ser\u00C3\u00A1 atribu\u00C3\u00ADdo ao idConta que tiver o Cartao do titular da mesma cancelado por um idStatusCartao que recomenda o cancelamento da conta.")
  public Long getIdStatusDestinoConta() {
    return idStatusDestinoConta;
  }
  public void setIdStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
  }

  
  /**
   * Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.
   **/
  @ApiModelProperty(required = true, value = "Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.")
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
    sb.append("  flagCadastroSenha: ").append(flagCadastroSenha).append("\n");
    sb.append("  flagCancelaCartao: ").append(flagCancelaCartao).append("\n");
    sb.append("  flagCancelaConta: ").append(flagCancelaConta).append("\n");
    sb.append("  flagCobraTarifa: ").append(flagCobraTarifa).append("\n");
    sb.append("  flagDesbloqueio: ").append(flagDesbloqueio).append("\n");
    sb.append("  flagDestinoTransferencia: ").append(flagDestinoTransferencia).append("\n");
    sb.append("  flagEmiteProvisorio: ").append(flagEmiteProvisorio).append("\n");
    sb.append("  flagExcecaoBandeira: ").append(flagExcecaoBandeira).append("\n");
    sb.append("  flagOrigemTransferencia: ").append(flagOrigemTransferencia).append("\n");
    sb.append("  flagReemiteCartao: ").append(flagReemiteCartao).append("\n");
    sb.append("  flagReversaoCancelamento: ").append(flagReversaoCancelamento).append("\n");
    sb.append("  flagReversaoDesbloqueio: ").append(flagReversaoDesbloqueio).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idStatusDestinoConta: ").append(idStatusDestinoConta).append("\n");
    sb.append("  idStatusDestinoDesbloqueio: ").append(idStatusDestinoDesbloqueio).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


