private var toast: Toast? = null
    private fun showToast(message: String) {
        if (toast != null) {
            toast?.cancel()
        }
        toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        toast?.show()
    }
