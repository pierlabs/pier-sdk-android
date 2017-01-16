package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o")
public class StatusCartao  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("flagCancelaCartao")
  private Integer flagCancelaCartao = null;
  @SerializedName("flagCancelaNoDesbloqueio")
  private Integer flagCancelaNoDesbloqueio = null;
  @SerializedName("idStatusDestinoDesbloqueio")
  private Long idStatusDestinoDesbloqueio = null;
  @SerializedName("idStatusDestinoConta")
  private Long idStatusDestinoConta = null;
  @SerializedName("flagCobraTarifa")
  private Integer flagCobraTarifa = null;

  
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
   * Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.")
  public Integer getFlagCancelaCartao() {
    return flagCancelaCartao;
  }
  public void setFlagCancelaCartao(Integer flagCancelaCartao) {
    this.flagCancelaCartao = flagCancelaCartao;
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
   * Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.")
  public Long getIdStatusDestinoDesbloqueio() {
    return idStatusDestinoDesbloqueio;
  }
  public void setIdStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
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
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.")
  public Integer getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Integer flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCartao {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  flagCancelaCartao: ").append(flagCancelaCartao).append("\n");
    sb.append("  flagCancelaNoDesbloqueio: ").append(flagCancelaNoDesbloqueio).append("\n");
    sb.append("  idStatusDestinoDesbloqueio: ").append(idStatusDestinoDesbloqueio).append("\n");
    sb.append("  idStatusDestinoConta: ").append(idStatusDestinoConta).append("\n");
    sb.append("  flagCobraTarifa: ").append(flagCobraTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


