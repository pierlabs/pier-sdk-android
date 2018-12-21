package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Account Status
 **/
@ApiModel(description = "Account Status")
public class StatusContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("permiteAlterarVencimento")
  private Integer permiteAlterarVencimento = null;
  @SerializedName("permiteAlterarLimite")
  private Integer permiteAlterarLimite = null;
  @SerializedName("permiteEmitirNovaViaCartao")
  private Integer permiteEmitirNovaViaCartao = null;
  @SerializedName("permiteFazerTransferencia")
  private Integer permiteFazerTransferencia = null;
  @SerializedName("permiteReceberTransferencia")
  private Integer permiteReceberTransferencia = null;
  @SerializedName("permiteCriarAcordoCobranca")
  private Integer permiteCriarAcordoCobranca = null;
  @SerializedName("permiteAtribuirComoBloqueio")
  private Integer permiteAtribuirComoBloqueio = null;
  @SerializedName("permiteDesbloquear")
  private Integer permiteDesbloquear = null;
  @SerializedName("permiteAtribuirComoCancelamento")
  private Integer permiteAtribuirComoCancelamento = null;

  
  /**
   * C?digo de Identifica??o do Status da Conta (id)
   **/
  @ApiModelProperty(required = true, value = "C?digo de Identifica??o do Status da Conta (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu?do ao Status da Conta
   **/
  @ApiModelProperty(required = true, value = "Nome atribu?do ao Status da Conta")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par?metro que define se o Status da conta permite a solicita??o da altera??o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite a solicita??o da altera??o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteAlterarVencimento() {
    return permiteAlterarVencimento;
  }
  public void setPermiteAlterarVencimento(Integer permiteAlterarVencimento) {
    this.permiteAlterarVencimento = permiteAlterarVencimento;
  }

  
  /**
   * Par?metro que define se o Status da conta permite altera??o de Limites, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite altera??o de Limites, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteAlterarLimite() {
    return permiteAlterarLimite;
  }
  public void setPermiteAlterarLimite(Integer permiteAlterarLimite) {
    this.permiteAlterarLimite = permiteAlterarLimite;
  }

  
  /**
   * Parameter that define if the status of the account allows to request a new r uma nova via de Cart?o, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Parameter that define if the status of the account allows to request a new r uma nova via de Cart?o, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteEmitirNovaViaCartao() {
    return permiteEmitirNovaViaCartao;
  }
  public void setPermiteEmitirNovaViaCartao(Integer permiteEmitirNovaViaCartao) {
    this.permiteEmitirNovaViaCartao = permiteEmitirNovaViaCartao;
  }

  
  /**
   * Par?metro que define se o Status da conta permite originar Transfer?ncias de Cr?dito para outras Contas do mesmo Emissor ou para uma Conta Banc?ria, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite originar Transfer?ncias de Cr?dito para outras Contas do mesmo Emissor ou para uma Conta Banc?ria, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteFazerTransferencia() {
    return permiteFazerTransferencia;
  }
  public void setPermiteFazerTransferencia(Integer permiteFazerTransferencia) {
    this.permiteFazerTransferencia = permiteFazerTransferencia;
  }

  
  /**
   * Par?metro que define se o Status da conta permite  receber Transfer?ncias de Cr?dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite  receber Transfer?ncias de Cr?dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteReceberTransferencia() {
    return permiteReceberTransferencia;
  }
  public void setPermiteReceberTransferencia(Integer permiteReceberTransferencia) {
    this.permiteReceberTransferencia = permiteReceberTransferencia;
  }

  
  /**
   * Par?metro que define se o Status da conta permite ter um Acordo de Cobran?a de D?vida criado para ela, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite ter um Acordo de Cobran?a de D?vida criado para ela, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteCriarAcordoCobranca() {
    return permiteCriarAcordoCobranca;
  }
  public void setPermiteCriarAcordoCobranca(Integer permiteCriarAcordoCobranca) {
    this.permiteCriarAcordoCobranca = permiteCriarAcordoCobranca;
  }

  
  /**
   * Par?metro que define se o Status da conta permite ser atribu?do para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite ser atribu?do para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * Par?metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * Par?metro que define se o Status da conta permite ser atribu?do para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo
   **/
  @ApiModelProperty(value = "Par?metro que define se o Status da conta permite ser atribu?do para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  permiteAlterarVencimento: ").append(permiteAlterarVencimento).append("\n");
    sb.append("  permiteAlterarLimite: ").append(permiteAlterarLimite).append("\n");
    sb.append("  permiteEmitirNovaViaCartao: ").append(permiteEmitirNovaViaCartao).append("\n");
    sb.append("  permiteFazerTransferencia: ").append(permiteFazerTransferencia).append("\n");
    sb.append("  permiteReceberTransferencia: ").append(permiteReceberTransferencia).append("\n");
    sb.append("  permiteCriarAcordoCobranca: ").append(permiteCriarAcordoCobranca).append("\n");
    sb.append("  permiteAtribuirComoBloqueio: ").append(permiteAtribuirComoBloqueio).append("\n");
    sb.append("  permiteDesbloquear: ").append(permiteDesbloquear).append("\n");
    sb.append("  permiteAtribuirComoCancelamento: ").append(permiteAtribuirComoCancelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
