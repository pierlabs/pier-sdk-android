package br.com.conductor.pier.api.v1_1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Est\u00C3\u00A1gio Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Est\u00C3\u00A1gio Cart\u00C3\u00A3o")
public class EstgioCarto  {
  
  @SerializedName("cancelaConta")
  private String cancelaConta = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idStatusDestinoDesbloqueio")
  private Long idStatusDestinoDesbloqueio = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("permiteDesbloqueio")
  private String permiteDesbloqueio = null;

  
  /**
   * Indica que Cart\u00C3\u00B5es com este idStatusCartao devem ter a sua conta Cancelada, sendo: (0 = N\u00C3\u00A3o Cancelar) e  (1 = Cancelar Conta).
   **/
  @ApiModelProperty(required = true, value = "Indica que Cart\u00C3\u00B5es com este idStatusCartao devem ter a sua conta Cancelada, sendo: (0 = N\u00C3\u00A3o Cancelar) e  (1 = Cancelar Conta).")
  public String getCancelaConta() {
    return cancelaConta;
  }
  public void setCancelaConta(String cancelaConta) {
    this.cancelaConta = cancelaConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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

  
  /**
   * Indica que Cart\u00C3\u00B5es com este idStatusCartao podem ser Desbloqueados, sendo: (0 = N\u00C3\u00A3o Permitido) e  (1 = Permitido).
   **/
  @ApiModelProperty(required = true, value = "Indica que Cart\u00C3\u00B5es com este idStatusCartao podem ser Desbloqueados, sendo: (0 = N\u00C3\u00A3o Permitido) e  (1 = Permitido).")
  public String getPermiteDesbloqueio() {
    return permiteDesbloqueio;
  }
  public void setPermiteDesbloqueio(String permiteDesbloqueio) {
    this.permiteDesbloqueio = permiteDesbloqueio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstgioCarto {\n");
    
    sb.append("  cancelaConta: ").append(cancelaConta).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idStatusDestinoDesbloqueio: ").append(idStatusDestinoDesbloqueio).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  permiteDesbloqueio: ").append(permiteDesbloqueio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


