package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Status Conta
 **/
@ApiModel(description = "Status Conta")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00EDdo ao Status da Conta.
   **/
  @ApiModelProperty(required = true, value = "Nome atribu\u00EDdo ao Status da Conta.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite a solicita\u00E7\u00E3o da altera\u00E7\u00E3o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite a solicita\u00E7\u00E3o da altera\u00E7\u00E3o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteAlterarVencimento() {
    return permiteAlterarVencimento;
  }
  public void setPermiteAlterarVencimento(Integer permiteAlterarVencimento) {
    this.permiteAlterarVencimento = permiteAlterarVencimento;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite altera\u00E7\u00E3o de Limites, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite altera\u00E7\u00E3o de Limites, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteAlterarLimite() {
    return permiteAlterarLimite;
  }
  public void setPermiteAlterarLimite(Integer permiteAlterarLimite) {
    this.permiteAlterarLimite = permiteAlterarLimite;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite solicitar uma nova via de Cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite solicitar uma nova via de Cart\u00E3o, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteEmitirNovaViaCartao() {
    return permiteEmitirNovaViaCartao;
  }
  public void setPermiteEmitirNovaViaCartao(Integer permiteEmitirNovaViaCartao) {
    this.permiteEmitirNovaViaCartao = permiteEmitirNovaViaCartao;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite originar Transfer\u00EAncias de Cr\u00E9dito para outras Contas do mesmo Emissor ou para uma Conta Banc\u00E1ria, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite originar Transfer\u00EAncias de Cr\u00E9dito para outras Contas do mesmo Emissor ou para uma Conta Banc\u00E1ria, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteFazerTransferencia() {
    return permiteFazerTransferencia;
  }
  public void setPermiteFazerTransferencia(Integer permiteFazerTransferencia) {
    this.permiteFazerTransferencia = permiteFazerTransferencia;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite  receber Transfer\u00EAncias de Cr\u00E9dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite  receber Transfer\u00EAncias de Cr\u00E9dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteReceberTransferencia() {
    return permiteReceberTransferencia;
  }
  public void setPermiteReceberTransferencia(Integer permiteReceberTransferencia) {
    this.permiteReceberTransferencia = permiteReceberTransferencia;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ter um Acordo de Cobran\u00E7a de D\u00EDvida criado para ela, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite ter um Acordo de Cobran\u00E7a de D\u00EDvida criado para ela, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteCriarAcordoCobranca() {
    return permiteCriarAcordoCobranca;
  }
  public void setPermiteCriarAcordoCobranca(Integer permiteCriarAcordoCobranca) {
    this.permiteCriarAcordoCobranca = permiteCriarAcordoCobranca;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo.")
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
