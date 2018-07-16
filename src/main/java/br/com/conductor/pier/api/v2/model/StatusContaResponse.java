package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{status_conta_response_description}}}
 **/
@ApiModel(description = "{{{status_conta_response_description}}}")
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
   * {{{status_conta_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_conta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_conta_response_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_conta_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_conta_response_permite_alterar_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_alterar_vencimento_value}}}")
  public Integer getPermiteAlterarVencimento() {
    return permiteAlterarVencimento;
  }
  public void setPermiteAlterarVencimento(Integer permiteAlterarVencimento) {
    this.permiteAlterarVencimento = permiteAlterarVencimento;
  }

  
  /**
   * {{{status_conta_response_permite_alterar_limite_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_alterar_limite_value}}}")
  public Integer getPermiteAlterarLimite() {
    return permiteAlterarLimite;
  }
  public void setPermiteAlterarLimite(Integer permiteAlterarLimite) {
    this.permiteAlterarLimite = permiteAlterarLimite;
  }

  
  /**
   * {{{status_conta_response_permite_emitir_nova_via_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_emitir_nova_via_cartao_value}}}")
  public Integer getPermiteEmitirNovaViaCartao() {
    return permiteEmitirNovaViaCartao;
  }
  public void setPermiteEmitirNovaViaCartao(Integer permiteEmitirNovaViaCartao) {
    this.permiteEmitirNovaViaCartao = permiteEmitirNovaViaCartao;
  }

  
  /**
   * {{{status_conta_response_permite_fazer_transferencia_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_fazer_transferencia_value}}}")
  public Integer getPermiteFazerTransferencia() {
    return permiteFazerTransferencia;
  }
  public void setPermiteFazerTransferencia(Integer permiteFazerTransferencia) {
    this.permiteFazerTransferencia = permiteFazerTransferencia;
  }

  
  /**
   * {{{status_conta_response_permite_receber_transferencia_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_receber_transferencia_value}}}")
  public Integer getPermiteReceberTransferencia() {
    return permiteReceberTransferencia;
  }
  public void setPermiteReceberTransferencia(Integer permiteReceberTransferencia) {
    this.permiteReceberTransferencia = permiteReceberTransferencia;
  }

  
  /**
   * {{{status_conta_response_permite_criar_acordo_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_criar_acordo_cobranca_value}}}")
  public Integer getPermiteCriarAcordoCobranca() {
    return permiteCriarAcordoCobranca;
  }
  public void setPermiteCriarAcordoCobranca(Integer permiteCriarAcordoCobranca) {
    this.permiteCriarAcordoCobranca = permiteCriarAcordoCobranca;
  }

  
  /**
   * {{{status_conta_response_permite_atribuir_como_bloqueio_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_atribuir_como_bloqueio_value}}}")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * {{{status_conta_response_permite_desbloquear_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_desbloquear_value}}}")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * {{{status_conta_response_permite_atribuir_como_cancelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{status_conta_response_permite_atribuir_como_cancelamento_value}}}")
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


