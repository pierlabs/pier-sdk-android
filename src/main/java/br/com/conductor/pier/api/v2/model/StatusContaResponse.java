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
  @SerializedName("flagAlteraLimite")
  private Integer flagAlteraLimite = null;
  @SerializedName("mensagemConsultaNegada")
  private String mensagemConsultaNegada = null;
  @SerializedName("flagPermiteNovaViaCartao")
  private Integer flagPermiteNovaViaCartao = null;
  @SerializedName("flagFazTransferencia")
  private Integer flagFazTransferencia = null;
  @SerializedName("flagRecebeTransferencia")
  private Integer flagRecebeTransferencia = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status da Conta (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status da Conta (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status da Conta.
   **/
  @ApiModelProperty(required = true, value = "Nome atribu\u00C3\u00ADdo ao Status da Conta.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da Conta permite realizar a Altera\u00C3\u00A7\u00C3\u00A3o de Limites do Portador, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(required = true, value = "Par\u00C3\u00A2metro que define se o Status da Conta permite realizar a Altera\u00C3\u00A7\u00C3\u00A3o de Limites do Portador, sendo: 0: Inativo e 1: Ativo.")
  public Integer getFlagAlteraLimite() {
    return flagAlteraLimite;
  }
  public void setFlagAlteraLimite(Integer flagAlteraLimite) {
    this.flagAlteraLimite = flagAlteraLimite;
  }

  
  /**
   * Apresenta o texto com o motivo que ser\u00C3\u00A1 apresentado na resposta as opera\u00C3\u00A7\u00C3\u00B5es de Listar e Consultar LimitesDisponibilidades.
   **/
  @ApiModelProperty(value = "Apresenta o texto com o motivo que ser\u00C3\u00A1 apresentado na resposta as opera\u00C3\u00A7\u00C3\u00B5es de Listar e Consultar LimitesDisponibilidades.")
  public String getMensagemConsultaNegada() {
    return mensagemConsultaNegada;
  }
  public void setMensagemConsultaNegada(String mensagemConsultaNegada) {
    this.mensagemConsultaNegada = mensagemConsultaNegada;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da conta permite a solicita\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o Status da conta permite a solicita\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
  public Integer getFlagPermiteNovaViaCartao() {
    return flagPermiteNovaViaCartao;
  }
  public void setFlagPermiteNovaViaCartao(Integer flagPermiteNovaViaCartao) {
    this.flagPermiteNovaViaCartao = flagPermiteNovaViaCartao;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da conta permite fazer transferencia, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o Status da conta permite fazer transferencia, sendo: 0: Inativo e 1: Ativo.")
  public Integer getFlagFazTransferencia() {
    return flagFazTransferencia;
  }
  public void setFlagFazTransferencia(Integer flagFazTransferencia) {
    this.flagFazTransferencia = flagFazTransferencia;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da conta permite receber transferencia, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o Status da conta permite receber transferencia, sendo: 0: Inativo e 1: Ativo.")
  public Integer getFlagRecebeTransferencia() {
    return flagRecebeTransferencia;
  }
  public void setFlagRecebeTransferencia(Integer flagRecebeTransferencia) {
    this.flagRecebeTransferencia = flagRecebeTransferencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  flagAlteraLimite: ").append(flagAlteraLimite).append("\n");
    sb.append("  mensagemConsultaNegada: ").append(mensagemConsultaNegada).append("\n");
    sb.append("  flagPermiteNovaViaCartao: ").append(flagPermiteNovaViaCartao).append("\n");
    sb.append("  flagFazTransferencia: ").append(flagFazTransferencia).append("\n");
    sb.append("  flagRecebeTransferencia: ").append(flagRecebeTransferencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


